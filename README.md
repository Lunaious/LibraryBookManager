# Spring MVC LibraryBookManager

Description

The Spring MVC Library Management system is a web-based application designed to manage a library's collection of books. This project addresses the need for efficient and user-friendly tools for libraries to maintain their book inventories, enabling seamless CRUD operations on book entries.

Table of Contents
- Installation
- Usage
- Features

Prerequisites
Java 8 or higher
Maven

## Installation
1. Clone the Repository
(Copy code below and paste in terminal)

git clone https://github.com/[your-github-username]/spring-mvc-library-management.git

2. Navigate to the Project Directory
(Copy code below and paste in terminal)

cd spring-mvc-library-management

3. Install Dependencies using Maven
(Copy code below and paste in terminal)

mvn clean install

4. Run the Application
(Copy code and paste in terminal)

mvn spring-boot:run


## Usage

Once the application is up and running, navigate to:

- Copy http request & paste into terminal:
http://localhost:8080/books/

- Adding a Book:
Click on the "Add New Book" link. Fill in the book details and submit.

- Editing a Book:
From the list of books, click on the "Edit" link next to the book you want to modify. Make the necessary changes and save.

- Deleting a Book:
Click on the "Delete" link next to the book entry you wish to remove.

## Features

- View Books: Lists all books in the library.
- Add Book: Provides a form to add a new book to the library.
- Edit Book: Allows modification of book details.
- Delete Book: Removes a book from the library.
- Responsive UI: Adapts to different screen sizes for optimal user experience.
- In-Memory Database: Uses H2 in-memory database for quick prototyping and testing.
