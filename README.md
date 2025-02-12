# Bank System

## Overview
This project implements a simple banking system in Java using **OOP principles** such as **abstraction, inheritance, and polymorphism**. It features:
- **BankAccount (Abstract Class)**: Defines a base structure for bank accounts.
- **SavingsAccount (Subclass)**: Implements a fixed interest rate and enforces a minimum balance.
- **CurrentAccount (Subclass)**: Allows overdrafts up to a specified limit.
- **Custom Exception Handling**: Throws `InsufficientFundsException` when necessary.

## Features
- Deposit money into an account.
- Withdraw money with validation for minimum balance (SavingsAccount) and overdraft limit (CurrentAccount).
- Display account balance.
- Exception handling for insufficient funds.

## Technologies Used
- Java 8
- OOP Principles
- Exception Handling
- IntelliJ IDEA
- Git & GitHub

## Setup and Execution
### Prerequisites
- Java 8 or later installed
- IntelliJ IDEA or any Java IDE
- Git installed

### Steps to Run
1. Clone the repository:
   ```sh
   git clone <your-repo-url>
   ```
2. Navigate to the project directory:
   ```sh
   cd bank-system
   ```
3. Open the project in IntelliJ IDEA.
4. Run `BankSystem.java` to execute the program.

## Class Structure
### `BankAccount` (Abstract Class)
#### Fields:
- `accountNumber`
- `accountHolder`
- `balance`

#### Methods:
- `deposit(double amount)`
- `withdraw(double amount)` (abstract method)
- `displayBalance()`

### `SavingsAccount` (Extends `BankAccount`)
- Enforces a **minimum balance** rule.
- Throws `InsufficientFundsException` if withdrawal violates the rule.

### `CurrentAccount` (Extends `BankAccount`)
- Allows **overdraft** up to a predefined limit.
- Throws `InsufficientFundsException` if overdraft limit is exceeded.

## Sample Usage
```java
BankAccount savings = new SavingsAccount(1001, "Alice", 2000);
BankAccount current = new CurrentAccount(1002, "Bob", 1000);

try {
    savings.deposit(500);
    savings.withdraw(1800); // Should fail due to min balance rule
} catch (InsufficientFundsException e) {
    System.out.println("Error: " + e.getMessage());
}

try {
    current.deposit(1000);
    current.withdraw(2500); // Should allow overdraft up to 2000
    current.withdraw(500);  // Should fail due to overdraft limit
} catch (InsufficientFundsException e) {
    System.out.println("Error: " + e.getMessage());
}

savings.displayBalance();
current.displayBalance();
```

## Exception Handling
- Custom `InsufficientFundsException` ensures controlled error handling for withdrawal failures.
- Uses **try-catch blocks** to manage runtime exceptions.

## Contribution
Feel free to fork this repository and submit pull requests for improvements.

## License
This project is licensed under the **MIT License**.

---
🚀 **Happy Coding!**

