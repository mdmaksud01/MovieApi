Movie Catalog REST API

#Project Description

This project is a simple Java Spring Boot RESTful API for managing a collection of movies.  
It demonstrates basic backend development concepts such as REST API creation, input validation, and in-memory data storage using an ArrayList.

The application does not use any database. All data is stored in memory and resets when the application restarts.


#Technologies Used

Java 17

Spring Boot

Maven

REST API

In-memory storage (ArrayList)


#project structure
movie-api/
├── src/main/java/com/example/movieapi
│ ├── MovieApiApplication.java
│ ├── controller/MovieController.java
│ ├── model/Movie.java
│ └── service/MovieService.java
├── src/main/resources
│ └── application.properties
├── pom.xml
└── README.md


#inputs 
field 	|	id 	|	name |	description 	|	realseyear	

type |	int |	string |	string	|	int



#API end points
for adding =>  https://movieapi-lu3d.onrender.com/api/movies/add
ex
{
  "id": 1,
  "name": "Inception",
  "description": "A mind-bending sci-fi thriller",
  "releaseYear": 2010
}

get by id =>   https://movieapi-lu3d.onrender.com/api/movies/get/1

get all =>   https://movieapi-lu3d.onrender.com/api/movies/all





