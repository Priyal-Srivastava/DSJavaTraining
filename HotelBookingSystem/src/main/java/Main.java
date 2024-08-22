import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    //create hotel booking java application with mongoDB
    //1. Create the client for establish the connection
    //2. Create Database and Collections (HotelBookingDB BoookingCollection)
    //3. Create Booking document(noOfRooms, noOfAdults, checkinDate, hotelName, checkoutDate, roomPreference, meals) and insert document into collection
    //4. Update booking document
    //5. Access all bookings document
    //6. Delete the booking document
    public static void main(String[] args) {

        // create mongoDB client for connection
        MongoClient client = MongoClients.create("mongodb://localhost:27017/");

        // create or get the database
        MongoDatabase hotelDB = client.getDatabase("hotelBookingDB");

//        // create the collection in hotelbookingDB
//        hotelDB.createCollection("bookingCollection");

        // for generating random bookingID
        //
        // Random random = new Random();

        // access the collection to create document
        MongoCollection<Document> bookingCollection= hotelDB.getCollection("bookingCollection");


        // use Document class to create document
//       var bookingDocument = new Document();

        // use Document class to create document
        Document bookingDocument = new Document();
//        // inserting a single document
//        bookingDocument.append("bookingID",random.nextInt(999999));
//        bookingDocument.append("hotelName","Renissance");
//        bookingDocument.append("userName","Priyal Srivastava");
//        bookingDocument.append("userEmail","p@gmail.com");
//        bookingDocument.append("userMobile","8787210426");
//        bookingDocument.append("checkinDate","28 August 2024");
//        bookingDocument.append("checkoutDate","29 August 2024");
//        bookingDocument.append("noofRooms",1);
//        bookingDocument.append("roomPrefernce","Suite");
//        bookingDocument.append("noofAdults",2);
//        bookingDocument.append("meal",false);
//        bookingDocument.append("price",2500);
//        // to insert the document into the bookingCollection
//        bookingCollection.insertOne(bookingDocument);

       //  to insert multiple document
//        ArrayList<Document> bookingList = new ArrayList<>();
//
//        bookingDocument.append("bookingID",random.nextInt(999999));
//        bookingDocument.append("hotelName","Renissance");
//        bookingDocument.append("userName","Nancy");
//        bookingDocument.append("userEmail","pn@gmail.com");
//        bookingDocument.append("userMobile","8787256");
//        bookingDocument.append("checkinDate","28 August 2024");
//        bookingDocument.append("checkoutDate","29 August 2024");
//        bookingDocument.append("noofRooms",1);
//        bookingDocument.append("roomPrefernce","Suite");
//        bookingDocument.append("noofAdults",2);
//        bookingDocument.append("meal",false);
//        bookingDocument.append("price",2500);
//        // to insert the document into the bookingList
//        bookingList.add(bookingDocument);
//
//
//        var bookingDocument1 = new Document();
//
//        bookingDocument1.append("bookingID",random.nextInt(999999));
//        bookingDocument1.append("hotelName","Renissance");
//        bookingDocument1.append("userName","Priya");
//        bookingDocument1.append("userEmail","pr@gmail.com");
//        bookingDocument1.append("userMobile","7937256");
//        bookingDocument1.append("checkinDate","28 August 2024");
//        bookingDocument1.append("checkoutDate","29 August 2024");
//        bookingDocument1.append("noofRooms",1);
//        bookingDocument1.append("roomPrefernce","Suite");
//        bookingDocument1.append("noofAdults",1);
//        bookingDocument1.append("meal",false);
//        bookingDocument1.append("price",2500);
//        // to insert the document into the bookingList
//        bookingList.add(bookingDocument1);
//
//
//        var bookingDocument2 = new Document();
//
//        bookingDocument2.append("bookingID",random.nextInt(999999));
//        bookingDocument2.append("hotelName","Renissance");
//        bookingDocument2.append("userName","Ruchika");
//        bookingDocument2.append("userEmail","r@gmail.com");
//        bookingDocument2.append("userMobile","244256");
//        bookingDocument2.append("checkinDate","28 August 2024");
//        bookingDocument2.append("checkoutDate","29 August 2024");
//        bookingDocument2.append("noofRooms",1);
//        bookingDocument2.append("roomPrefernce","Suite");
//        bookingDocument2.append("noofAdults",2);
//        bookingDocument2.append("meal",false);
//        bookingDocument2.append("price",2500);
//        // to insert the document into the bookingList
//        bookingList.add(bookingDocument2);
//
//        // to insert the bookingList into the bookingCollection
//        bookingCollection.insertMany(bookingList);


        // note - comment the insert many code
        // to update the single document
//        bookingCollection.updateOne(new Document("userName","Priyal Srivastava"),
//                new Document("$set",new Document("meal",true)));

//        // to update the multiple values in a document
//        Document document = new Document();
//        document.append("noofAdults",1);
//        document.append("meal",true);
//        document.append("price", 3000);

//        bookingCollection.updateMany(new Document("userName","Priyal Srivastava"), new Document("$set",document));

        // to delete one whole document
//        bookingCollection.deleteOne(new Document("bookingID",271460));

        // to delete many
        // delete all the documents with tha name priyal srivastava
        bookingCollection.deleteMany(new Document("userName","Priyal Sriavstava"));
    }
}