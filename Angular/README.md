# Contents:
1. [Getting Started](#getting_started)
2. [The Basics](#the_basics)
3. [Components & Databinding](#components_&_databinding)
4. [Directives](#directives)
5. [Services & Dependency Injection](#)
6. [Routing](#)
7. [Observables](#)
8. [Forms](#)
9. [Pipes](#)
10. [Http](#)
11. [Authentication](#)
12. [Optimizations & NgModules](#)
13. [Deployment](#)
14. [Animations & Testing](#)

# 1. Getting Started?
<a name='getting_started'></a>

Angular is a JavaScript Framework which allows us to create reactive Single-Page-Applicaitons.
## Creating a new project:
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
The file _app.component.html_ will be rendered on the browser. The file _app.component.ts_ will be converted into javascript and will be part of the script that will be imported into the static file.

## How Angular works:
Now looking at the rendered page in the browser, the html code for that is: 
```html
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>MyFirstApp</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
<link rel="stylesheet" href="styles.css"></head>
<body>
  <app-root></app-root>
<script src="runtime.js" defer></script><script src="polyfills.js" defer></script><script src="vendor.js" defer></script><script src="main.js" defer></script></body>
</html>
```
The html file used is the __index.html__ in the _src_ directory, without the inclusion of script tags- which are injected automatically by angular by compiling __app.component.ts__.   
Here we can see that there is a tag called <app-root></app-root>. And when taking a look at the file _app.component.ts_, it has a component called `app-root`:
```typescript
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';
}
```
## Making small changes to the app:
_Problem Statement:_ Make changes to the app, so that there is an input box and when we enter something in that input box, it displays the same in a paragraph below that.  
Changes that need to be made:  
* __app.component.html:__ Replace the old code with the below text:
```html
<input type="text" [(ngModel)]="name">
<p>{{ name }}</p>
```
* __app.component.ts:__ In the class appcomponent, change the name of the variable to `name` from title.
* __app.module.ts:__  These lines need to be added to the file:
```typescript
import {FormsModule} from '@angular/forms';

// Add FormsModule to the imports
imports: [
    BrowserModule,
    FormsModule
  ]
```
This solves our task required. More on what each thing does later.

## What is TypeScript?
* TypeScript is a superset of JavaScript. It offers more feature than vanilla JS-- Types- Strong Typing, Classes, Interfaces, etc. 
* TypeScript doesn't run on the browser, thus it is compiled to JavaScript, which is done by the Angular CLI.