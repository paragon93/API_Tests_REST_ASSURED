# API_Tests_REST_ASSURED
sample API tests written in Java using the REST Assured library and the TestNG annotation

The server I am using to run the tests: https://github.com/typicode/json-server

Getting started
Install JSON Server

npm install -g json-server
Create a db.json file with some data

{
  "posts": [
    { "id": 1, "title": "json-server", "author": "typicode" }
  ],
  "comments": [
    { "id": 1, "body": "some comment", "postId": 1 }
  ],
  "profile": { "name": "typicode" }
}
Start JSON Server

json-server --watch db.json
Now if you go to http://localhost:3000/posts/1, you'll get

{ "id": 1, "title": "json-server", "author": "typicode" }


This project includes the basics of tests:
- AddPostTest (this test uses the POST method, the test performs adding a new post)
- GetPostTest (this test uses the GET method, test performs downloading a specific post)
- GetPostsTest (this test uses the GET method, test performs downloading all posts)
- PatchPostTest (this test uses the PATCH method, test update a specific post)
- UpdatePostTest (this test uses the PUT method, test update a specific post)
- BasteTest (this class contains the configuration for all tests)
