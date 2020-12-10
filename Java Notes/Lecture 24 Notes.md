Lecture 24 Lecture at 6:17pm on December 9th, 2020

---

Browsers are actually called **Web Clients**

## Web Services

- A **web service** is any piece of software that makes itself available over the **internet**and uses a standardized XML messaging system.
- a web service **only delivers data**
- data is stored in **JSON** or **XML**
  - not HTML
- the responsibility of the server **is to deliver the data**

### Microservice

- also known as the *microservice* architecture - is an architectural style that structures an application as a collection of *services* that are.

*You can run a database and a web server on the same computer*

The hardware is Unix, mainframes

When we talk about servers, we aren't talking about hardware

### HTTP 

Hypertext Transfer Protocol (**HTTP**) is an application-layer protocol for transmitting hypermedia documents, such as HTML

You can make HTTP requests without the use of a browser 

---

## The GET Method

**GET is used to request data from a specified resource.**

**GET is one of the most common HTTP methods.** 

Note that the query string (name/value pairs) is sent in the URL of a GET request:

```/test/demo_form.php?name1=value1&name2=value2```

**Some other notes on GET requests:**

- GET requests can be cached
- GET requests remain in the browser history
- GET requests can be bookmarked
- GET requests should never be used when dealing with sensitive data
- GET requests have length restrictions
- GET requests are only used to request data (not modify)

---

## The POST Method

**POST is used to send data to a server to create/update a resource.**

The data sent to the server with POST is stored in the request body of the HTTP request:

POST /test/demo_form.php HTTP/1.1
Host: w3schools.com
name1=value1&name2=value2

**POST is one of the most common HTTP methods.** 

**Some other notes on POST requests:**

- POST requests are never cached
- POST requests do not remain in the browser history
- POST requests cannot be bookmarked
- POST requests have no restrictions on data length

---

### Why learn HTTP Protocol?

**No, *HTML* is not a programming *language*. The "M" stands for "Markup". 

**Screen scraping** is the act of copying information that shows on a digital display so it can be used for another purpose. Visual data can be collected as raw text from on-**screen** elements such as a text or images that appear on the desktop, in an application or on a website.

### Why would the connection between us and the host need to be severed (connection lost)?

- traffic!

### Java Servlet

A **servlet** is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model.

The primary purpose of the **Servlet** specification **is** to define a robust mechanism for sending content to a client as defined by the Client/Server model. **Servlets** are most popularly used for generating dynamic content on the Web and have native support for HTTP.

- precompiled to a **.class**

### JSP (Java Server Pages)

*Java Server Pages* (JSP; formerly *JavaServer Pages*) is a collection of technologies that helps software developers create dynamically generated web *pages* based on HTML, XML, SOAP, or other document types.

- not compiled; it just sits and exists like a .java file, then gets compiled **when used**

