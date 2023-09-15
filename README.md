# Library Book Manager Spring JDBC Project

**Description**

The LibraryBookManager Spring JDBC project is a simple web application that allows users to view a list of books and add new ones to a database. Designed using the Spring JDBC framework, this project addresses the need for a straightforward and efficient way to manage books in a bookstore setting.

Table of Contents

- Installation
- Usage
- Features

Prerequisites:
Java JDK 11 or later
Maven
An IDE (e.g., IntelliJ IDEA, Eclipse)

## Installation
Steps:
1. Clone the repository:
Bash: git clone https://github.com/yourusername/LibraryBookManager.git
1. Navigate to the project directory:
Bash: cd LibraryBookManager
1. Install the dependencies using Maven:
Bash: mvn install
1. Run the project:
Bash: mvn spring-boot:run

## Usage

Once the application is running, navigate to http://localhost:8080/books in your browser.

Viewing Books: Simply access the above URL to view a list of all books.
Adding a Book: Use a tool like Postman or CURL to send a POST request with book details.
Example using CURL:

Bash: curl -X POST -H "Content-Type: application/json" -d '{"title":"Book Title", "author":"Author Name", "publishedDate":"2021-08-28"}' http://localhost:8080/books

## Features

- View All Books: Displays a list of all books stored in the database.
- Add New Books: Easily add new books to the database using a simple API endpoint.
- In-Memory Database: Uses H2 in-memory database for quick setup and testing.
- Spring Boot Integration: Leverages Spring Boot for rapid development and ease of configuration.
