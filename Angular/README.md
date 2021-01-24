# Contents:
1. [Getting Started](#getting_started)

## Getting Started?
<a name='getting_started'></a>

Angular is a JavaScript Framework which allows us to create reactive Single-Page-Applicaitons.
### Creating a new project:
```shell
$ng new my-first-app
```
Running this command will create a new project. It will ask a few questions around bindings, routing and styling. Choose as per your preference, and voila- your project is ready.  
  
After the project is build, go to that directory and run the command `ng serve` to start the application.
```shell
$cd my-first-app
$ng server
```
This will start the application on port 4200 by default.

File structure related to the app running:  
_package.json_: Just like any other node/npm app, this conains all the third party packages and dependecies that the project needs to run correctly. This is divided into two parts: dependencies and devDependencies. The dependencies are the packages that the app needs to run, whereas the devDependencies are the packages that are useful during the development.  
_node-modules_: This directory saves all the packages that are listed in package.json.  
_src_: This directory has all the code for the project/app. The files/directores outside that are configuration items, and do not contribute much to app functionality.  

In src directory, there is another directory called 'app'. This directory saves all the code that is mainly responsible for working of the angular app.