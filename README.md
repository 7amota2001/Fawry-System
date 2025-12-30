# Fawry System

A Java-based payment and service management system that simulates the functionality of Fawry, Egypt's leading electronic payment platform. This system allows users to pay bills, recharge mobile services, donate to charities, and manage digital wallets.

## 📋 Overview

The Fawry System is a comprehensive electronic payment solution that enables users to:
- Recharge mobile phone credits for multiple service providers
- Pay for internet services
- Pay landline bills (monthly or quarterly)
- Make donations to various organizations
- Manage digital wallets
- Process payments via multiple payment methods

## ✨ Features

### User Features
- **User Authentication**: Sign up, sign in, and secure access
- **Mobile Recharge**: Top up mobile credits for Orange, Vodafone, We, and Etisalat
- **Internet Services**: Pay for internet packages from various providers
- **Landline Payments**: Pay monthly or quarterly landline receipts
- **Donation Services**: Donate to charitable organizations (Cancer Hospital, Schools, NGOs)
- **Wallet Management**: Add funds to digital wallet and use it for payments
- **Payment Methods**: Pay using digital wallet or credit/debit card (Visa)
- **Transaction History**: Track all payment transactions

### Admin Features
- **Admin Dashboard**: Special admin interface for system management
- **Discount Management**: Apply discounts across the system

## 🏗️ Design Patterns Implemented

This project demonstrates several software design patterns:

### 1. **Factory Pattern**
- `ServiceFactory` interface with concrete implementations:
  - `OrangeFactory`
  - `VodafoneFactory`
  - `WeFactory`
  - `EtisalatFactory`
- Creates mobile and internet service objects for different providers

### 2. **Strategy Pattern**
- `PaymentStrategy` interface with implementations:
  - `PayByWallet`: Payment using digital wallet
  - `PayByVisa`: Payment using credit/debit card
- Allows flexible payment method selection at runtime

### 3. **Decorator Pattern**
- `DiscountDecorator` abstract class
- `OverallDiscount` and `SpecificDiscount` implementations
- Dynamically adds discount functionality to payment operations

### 4. **Abstract Factory Pattern**
- Service creation through factory interfaces
- Separates object creation from business logic

## 🏛️ System Architecture

### Core Components

#### Authentication & User Management
- `LoginController`: Handles user authentication
- `LoginForm`: User interface for login and registration
- `User`: User entity with wallet management
- `Admin`: Administrator entity

#### Service Management
- `Client`: Facade for accessing services
- `MobileService`: Interface for mobile recharge services
- `InternetService`: Interface for internet payment services
- `LandlineService`: Handles landline bill payments
- `DonationService`: Manages charitable donations

#### Service Implementations
- Mobile: `VodafoneMobile`, `OrangeMobile`, `WeMobile`, `EtisalatMobile`
- Internet: `VodafoneInternet`, `OrangeInternet`, `WeInternet`, `EtisalatInternet`
- Donations: `CancerHospital`, `School`, `NOG` (NGO)
- Receipts: `MonthlyReceipt`, `QuarterReceipt`

#### Payment Processing
- `PaymentMethod`: Base payment interface
- `Transaction`: Transaction record management
- Payment strategies for different payment methods

#### User Interface
- `SystemForm`: Main system menu and operations
- `AdminForm`: Administrator interface

## 📁 Project Structure

```
Fawry-System/
├── src/
│   ├── Main.java                    # Application entry point
│   ├── LoginForm.java               # Login and registration UI
│   ├── LoginController.java         # Authentication logic
│   ├── SystemForm.java              # Main system interface
│   ├── AdminForm.java               # Admin interface
│   │
│   ├── User.java                    # User entity
│   ├── Admin.java                   # Admin entity
│   │
│   ├── ServiceFactory.java          # Service factory interface
│   ├── OrangeFactory.java           # Orange services factory
│   ├── VodafoneFactory.java         # Vodafone services factory
│   ├── WeFactory.java               # We services factory
│   ├── EtisalatFactory.java         # Etisalat services factory
│   │
│   ├── Client.java                  # Service facade
│   ├── MobileService.java           # Mobile service interface
│   ├── InternetService.java         # Internet service interface
│   ├── LandlineService.java         # Landline payment service
│   ├── DonationService.java         # Donation service
│   │
│   ├── PaymentStrategy.java         # Payment strategy interface
│   ├── PayByWallet.java             # Wallet payment implementation
│   ├── PayByVisa.java               # Card payment implementation
│   ├── PaymentMethod.java           # Payment method base
│   │
│   ├── DiscountDecorator.java       # Discount decorator base
│   ├── OverallDiscount.java         # Overall discount implementation
│   ├── SpecificDiscount.java        # Specific discount implementation
│   │
│   ├── Transaction.java             # Transaction management
│   ├── Receipt.java                 # Receipt interface
│   ├── MonthlyReceipt.java          # Monthly receipt
│   ├── QuarterReceipt.java          # Quarterly receipt
│   │
│   ├── Donation.java                # Donation base
│   ├── CancerHospital.java          # Hospital donation
│   ├── School.java                  # School donation
│   ├── NOG.java                     # NGO donation
│   │
│   ├── FilePath.java                # File path configuration
│   ├── GlobalVariable.java          # Global variables
│   └── Identifier.java              # Identifier interface
│
├── User.txt                         # User data storage
├── Admin.txt                        # Admin data storage
└── SDA.iml                          # IntelliJ IDEA module file
```

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- An IDE (IntelliJ IDEA, Eclipse, NetBeans) or command line tools

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/7amota2001/Fawry-System.git
   cd Fawry-System
   ```

2. **Compile the project**
   ```bash
   javac -d out src/*.java
   ```

3. **Run the application**
   ```bash
   java -cp out Main
   ```

### Using IntelliJ IDEA

1. Open IntelliJ IDEA
2. Click on "Open" and select the `Fawry-System` directory
3. The project should be recognized with the `SDA.iml` module file
4. Right-click on `Main.java` in the `src` folder
5. Select "Run 'Main.main()'"

## 📖 Usage Guide

### For Users

1. **Sign Up**
   - Select option 3 from the main menu
   - Enter your email, username, and password
   - Your account will be created with an empty wallet

2. **Sign In**
   - Select option 1 from the main menu
   - Enter your credentials
   - Access the system menu

3. **Recharge Mobile**
   - Select option 1 from the system menu
   - Choose a service provider (orange, vodafone, we, etisalat)
   - Enter the recharge amount
   - Select payment method (wallet or visa)

4. **Pay for Internet**
   - Select option 2 from the system menu
   - Choose a service provider
   - Enter the payment amount
   - Select payment method

5. **Pay Landline Bill**
   - Select option 3 from the system menu
   - Choose receipt type (monthly or quarter)
   - Complete the payment

6. **Make a Donation**
   - Select option 4 from the system menu
   - Choose an organization (hospital, school, NOG)
   - Enter donation amount
   - Complete the payment

7. **Add Wallet Credit**
   - Select option 5 from the system menu
   - Enter the amount to add
   - Funds will be added to your wallet

### For Administrators

1. **Admin Sign In**
   - Select option 2 from the main menu
   - Enter admin credentials (stored in Admin.txt)
   - Access the admin dashboard

2. **Manage Discounts**
   - Apply overall or specific discounts to services
   - Configure discount percentages

## 💾 Data Storage

The system uses text files for data persistence:
- `User.txt`: Stores user information (email, username, password, wallet balance)
- `Admin.txt`: Stores administrator credentials

**Format**: Each user record consists of 4 lines:
```
email
username
password
wallet_balance
```

## 🔧 Configuration

The `FilePath` class manages file paths for data storage. Update this class if you need to change data file locations.

## 🎓 Educational Purpose

This project was created for educational purposes to demonstrate:
- Object-Oriented Programming principles
- Design pattern implementation
- Java file I/O operations
- User authentication and authorization
- Payment processing simulation

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License

This project is available for educational purposes. Please check with the repository owner for specific licensing terms.

## 👥 Authors

- [@7amota2001](https://github.com/7amota2001)

## 🙏 Acknowledgments

- Inspired by Fawry, Egypt's leading electronic payment platform
- Created as a Software Design and Architecture (SDA) project

---

**Note**: This is a simulation system for educational purposes. It does not process real payments or connect to actual service providers.
