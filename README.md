<p align="center">
  <img src="https://iili.io/3FFO5cF.png" alt="Universidade Católica de Brasília">
</p>

## PERSONAL PROJECT - MS-STOCK 📦

### 📖 Description
Microservice responsible for **managing inventory and stock availability** of the library. MS-Stock is responsible for:
- 📦 **Manage stock items** with quantities available
- 📤📥 **Track stock movements** (entries and exits)
- 🔒 **Reserve items** for confirmed orders
- ⏱️ **Manage reservations** with expiration tracking
- 📊 **Monitor availability** status of products
- 🔍 **Query stock levels** for each book
- 📈 **Track stock history** for auditing
- 🚨 **Prevent overselling** with validation

This service is part of a microservices architecture composed of:

- [`bff-wzzy-library`](https://github.com/codewesleylima/bff-wzzy-library) – Central gateway and orchestration
- [`ms-wzzy-auth`](https://github.com/codewesleylima/ms-wzzy-auth) – Authentication and JWT token management
- [`ms-wzzy-catalog`](https://github.com/codewesleylima/ms-wzzy-catalog) – Book catalog, authors, publishers, and categories
- [`ms-wzzy-customers`](https://github.com/codewesleylima/ms-wzzy-customers) – Customer profile, address, and preference management
- [`ms-wzzy-order`](https://github.com/codewesleylima/ms-wzzy-order) – Shopping cart and order orchestration
- [`ms-wzzy-payments`](https://github.com/codewesleylima/ms-wzzy-payments) – Payment processing and gateway integration
- [`ms-wzzy-stock`](https://github.com/codewesleylima/ms-wzzy-stock) – Inventory and availability management

---

## 🔁 Stock Management Flow

**Stock Availability Check:**

1. **Client** → BFF: Adds book to cart
2. BFF → **ms-order**: Registers item in cart
3. **ms-order** → **ms-stock**: Checks availability
4. **ms-stock** → Database: Queries stock level
5. Database → **ms-stock**: Returns quantity
6. **ms-stock** → **ms-order**: Confirms availability
7. **ms-order** → BFF: Confirms item added

**Stock Reservation Flow:**

1. **Client** → BFF: Confirms order
2. BFF → **ms-order**: Creates order
3. **ms-order** → **ms-stock**: Requests reservation
4. **ms-stock** → Database: Validates and reserves items
5. **ms-stock** → Database: Records movement (reservation)
6. **ms-stock** → **ms-order**: Confirms reservation
7. **ms-order** → **ms-payments**: Processes payment
8. **ms-payments** → **ms-order**: Confirms payment
9. **ms-order** → **ms-stock**: Confirms final reserve
10. **ms-stock** → Database: Updates availability

---

### ⚡ Features

1. 📦 Manage stock items with available quantities
2. 📤📥 Track stock movements (entries and exits)
3. 🔒 Reserve items for confirmed orders
4. ⏱️ Manage reservations with expiration tracking
5. 📊 Monitor product availability status
6. 🔍 Query stock levels per book
7. 📈 Track stock history for auditing
8. 🚨 Prevent overselling with validation
9. 🔄 Handle stock adjustments and corrections
10. 📋 Generate stock reports and analytics

---

### 🖥️ **Running Locally**

To run the project locally:

```sh
./gradlew bootRun
```

> 💡 Make sure PostgreSQL database is running and configured in `application.properties`.

---

#### 🛠️ Technologies Used

- ☕ Java 21
- 🍃 Spring Boot 3
- 🌐 Spring Cloud OpenFeign (integration with ms-order)
- 📦 Spring Data JPA
- 🗄️ PostgreSQL
- 🧪 JUnit / Mockito
- 🔧 Gradle

---

### 🛺 Author

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesslima/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQH8pgDMsT7zMw/profile-displayphoto-crop_800_800/B4DZs03OodH8AM-/0/1766118457145?e=1781136000&v=beta&t=-N2WNA9CWJ7Io6nX33GPNvYtFl9ZQMAM-jALLlYNGc8" width="100px;" alt="Wesley Lima Photo"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
