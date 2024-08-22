<%@ page import = "com.mongodb.client.MongoClients" %>
<%@ page import = "org.bson.Document" %>
<%@ page import = "java.util.Random" %>

<html>
<body>

<%

<!-- inserting data from the session -->

String name = session.getAttribute("username").toString();
String email = session.getAttribute("useremail").toString();
String mes = session.getAttribute("message").toString();

var client1 = MongoClients.create("mongodb://localhost:27017/");
var database1 = client1.getDatabase("portfolioDB");
var collection1 = database1.getCollection("contactTB");

var document1 = new Document();

Random random = new Random();
int i = random.nextInt(999999);
document1.append("userID",i);
document1.append("userName",name);
document1.append("userEmail",email);
document1.append("userMessage",mes);

collection1.insertOne(document1);
System.out.println("Submit");

%>

</body>
</html>
