# 📦 Warehouse Management System

A Java Swing desktop application for managing warehouse inventory, customer data, transactions, and stock movement in a simple, user-friendly interface.

## Overview

This project is designed to help manage:

- product inventory and stock levels
- product expiration tracking
- customer and transaction records
- user sign-in/sign-up flow
- sales and stock reports

It is built as a desktop application using Java Swing and CSV files for local data persistence.

---

## Features

- Add, update, and remove products
- Track inventory quantities and product details
- Monitor batch and expiration information
- Record customer and transaction data
- Login and sign-up screens for demo access flow
- Display warehouse reports and management panels
- Role-based UI layout for admin and employee-style access

---

## Tech Stack

- Java 11+
- Swing (GUI)
- CSV files for local data storage
- IntelliJ IDEA / Java IDE

---

## Project Structure

```text
Warehouse-Management-System/
├── README.md
├── .gitignore
├── src/
│   ├── Batch.csv
│   ├── Inventory.csv
│   ├── Transaction.csv
│   ├── Users .csv
│   ├── customers.csv
│   ├── gui/
│   │   ├── SIGN.java
│   │   ├── SignUp.java
│   │   ├── check.java
│   │   └── finish.java
│   └── img/
│       └── application assets and icons
└── .idea/ (if present in local environment)
```

---

## How to Run

### Prerequisites

- JDK 11 or later
- IntelliJ IDEA or any Java IDE

### Steps

1. Clone the repository:

```bash
git clone https://github.com/abood190-c/Warehouse-Management-System.git
```

2. Open the project in your Java IDE.

3. Compile and run the login screen:

```text
src/gui/SIGN.java
```

4. After successful login, the application launches the main warehouse system interface.

> Note: The project stores data locally in CSV files under the `src` folder, so running it in an IDE will use those files directly.

---

## Authentication Note

The repository includes a login/sign-up interface, but it is a demo-style desktop application and does not implement a full backend authentication system or secure user management. The login flow is handled locally within the GUI and data files.

---

## Screenshots

This section will be updated with UI screenshots of the main screens as the project evolves.

---

## Authors

- [abood190-c](https://github.com/abood190-c)
- [MohamadSobuh](https://github.com/MohamadSobuh)

---

## License

This project does not currently include a license file. If you plan to share or distribute it publicly, consider adding an appropriate open-source license.
