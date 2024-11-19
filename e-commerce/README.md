# Simple CRUD E-commerce App with Spring Boot, MySQL, and JPA

This is a simple **E-commerce CRUD application** built with **Spring Boot**, **JPA** (Java Persistence API), and **MySQL**. The app allows users to interact with a basic e-commerce platform where they can view and manage products, place orders, manage their cart, and track payments and shipping information.

### **Modules**

This application includes the following modules:

- **Users**: Represents customers who place orders.
- **Products**: Represents items available for purchase.
- **Categories**: Organizes products into categories (e.g., Electronics, Clothing).
- **Orders**: Represents a customer's order, including multiple products and their quantities.
- **Payments**: Tracks payment details for orders.
- **Cart**: Temporary storage for products before an order is placed.
- **Shipping**: Stores shipping information related to orders.

---

### **Technologies Used**

- **Spring Boot**: Framework for building Java-based applications.
- **Spring Data JPA**: Java Persistence API for managing relational data in a database.
- **MySQL**: Relational database to store data.
- **Lombok**: Reduces boilerplate code by generating getters, setters, constructors, and more.
- **Spring Web**: To build RESTful APIs for the e-commerce system.

---

### **Project Structure**

```
src/
 ├── main/
 │   ├── java/
 │   │   └── com/
 │   │       └── example/
 │   │           ├── ecommerce/
 │   │           │   ├── model/
 │   │           │   │   ├── User.java
 │   │           │   │   ├── Product.java
 │   │           │   │   ├── Category.java
 │   │           │   │   ├── Order.java
 │   │           │   │   ├── Payment.java
 │   │           │   │   ├── Cart.java
 │   │           │   │   └── Shipping.java
 │   │           │   ├── repository/
 │   │           │   │   ├── UserRepository.java
 │   │           │   │   ├── ProductRepository.java
 │   │           │   │   ├── CategoryRepository.java
 │   │           │   │   ├── OrderRepository.java
 │   │           │   │   ├── PaymentRepository.java
 │   │           │   │   ├── CartRepository.java
 │   │           │   │   └── ShippingRepository.java
 │   │           │   ├── service/
 │   │           │   │   ├── UserService.java
 │   │           │   │   ├── ProductService.java
 │   │           │   │   ├── CategoryService.java
 │   │           │   │   ├── OrderService.java
 │   │           │   │   ├── PaymentService.java
 │   │           │   │   ├── CartService.java
 │   │           │   │   └── ShippingService.java
 │   │           │   └── controller/
 │   │           │       ├── UserController.java
 │   │           │       ├── ProductController.java
 │   │           │       ├── CategoryController.java
 │   │           │       ├── OrderController.java
 │   │           │       ├── PaymentController.java
 │   │           │       ├── CartController.java
 │   │           │       └── ShippingController.java
 │   ├── resources/
 │   │   ├── application.properties
 │   │   └── schema.sql
 └── pom.xml
```

---

### **Getting Started**

#### Prerequisites

- Java 11 or later
- MySQL installed and running
- Maven for building the project

#### Setup MySQL Database

1. Install MySQL and create a new database. You can run the following SQL commands to create a database and a user for the project:

```sql
CREATE DATABASE ecommerce_db;

CREATE USER 'ecommerce_user'@'localhost' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON ecommerce_db.* TO 'ecommerce_user'@'localhost';

FLUSH PRIVILEGES;
```

2. Update the `application.properties` file with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=ecommerce_user
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

---

### **Running the Application**

1. Clone this repository to your local machine:

2. Build the application using Maven:

```bash
mvn clean install
```

3. Run the application:

```bash
mvn spring-boot:run
```

The application will run on **localhost:8080** by default.

---

### **API Endpoints**

#### 1. **Users Module**
- **Create User**: `POST /api/users`
- **Get All Users**: `GET /api/users`
- **Get User by ID**: `GET /api/users/{id}`
- **Update User**: `PUT /api/users/{id}`
- **Delete User**: `DELETE /api/users/{id}`

#### 2. **Products Module**
- **Create Product**: `POST /api/products`
- **Get All Products**: `GET /api/products`
- **Get Product by ID**: `GET /api/products/{id}`
- **Update Product**: `PUT /api/products/{id}`
- **Delete Product**: `DELETE /api/products/{id}`

#### 3. **Categories Module**
- **Create Category**: `POST /api/categories`
- **Get All Categories**: `GET /api/categories`
- **Get Category by ID**: `GET /api/categories/{id}`
- **Update Category**: `PUT /api/categories/{id}`
- **Delete Category**: `DELETE /api/categories/{id}`

#### 4. **Orders Module**
- **Create Order**: `POST /api/orders`
- **Get All Orders**: `GET /api/orders`
- **Get Order by ID**: `GET /api/orders/{id}`
- **Update Order**: `PUT /api/orders/{id}`
- **Delete Order**: `DELETE /api/orders/{id}`

#### 5. **Payments Module**
- **Create Payment**: `POST /api/payments`
- **Get All Payments**: `GET /api/payments`
- **Get Payment by ID**: `GET /api/payments/{id}`

#### 6. **Cart Module**
- **Add Product to Cart**: `POST /api/carts/{userId}/add`
- **Get Cart for User**: `GET /api/carts/{userId}`
- **Update Cart**: `PUT /api/carts/{userId}`
- **Remove Product from Cart**: `DELETE /api/carts/{userId}/remove/{productId}`

#### 7. **Shipping Module**
- **Create Shipping Info**: `POST /api/shippings`
- **Get Shipping Info by Order ID**: `GET /api/shippings/{orderId}`

---
