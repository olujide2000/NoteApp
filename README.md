NOTE APP.

The Note App is a Java based android app . The Note App takes in notes and stores it in database and in this 
case we made use of Room Database. Some dependencies were imported in other to have full access to room database capabilities in android studio. 
The launch page of the app is the Mainactivity as shown below;


![image](https://user-images.githubusercontent.com/54988649/202929874-b3e7237d-5fc4-4aa1-9d50-4d1f6b07fa1a.png)


                                
Adding notes into the database is done by clicking the floating button with a '+' sign as 
displayed on the image above. The button navigates the user to the new activity page added through the manifest.  
The pages requests from the user to supply the title of the note which is not compulsory before proceeding to the note input interface. 
The title provides proper labelling of each note for identification.

The input page is displayed below;


![image](https://user-images.githubusercontent.com/54988649/202929952-27d427da-8d8e-46b4-9c20-2fd8d6f5b832.png)


                                      
The save button is used to save the note into the Room database as shown above. 


The pictorial representation of the whole process are shown below;


![image](https://user-images.githubusercontent.com/54988649/202929996-dcd8c001-f5e9-4e5c-adba-6bb602d3dddf.png)![image](https://user-images.githubusercontent.com/54988649/202930003-ecdc7b0e-032b-4c90-aea3-a16eac8f12cd.png)![image](https://user-images.githubusercontent.com/54988649/202930011-8fd49935-a32a-4e57-a5e9-3ffaf4832fab.png)



    

In addition, note can be updated by simply double click the specific note that needs to be updated.
However, to delete a note, user needs to long click on the identified note and a menu will popup which include Pin/Unpin menu and delete. 
The listed task will be carried out by a single click of the menu item. 


The image below shows a pinned note;



![image](https://user-images.githubusercontent.com/54988649/202930122-794e35a3-0466-4b69-808f-2a678d352f06.png)


                             

The Note App is a demonstration of how to capture Live data and store in the database using 
the room database service as offered in Android studio.

Dependencies used are listed below;

implementation "androidx.room:room-runtime:2.4.3"
implementation 'androidx.room:room-common:2.4.3'
annotationProcessor "androidx.room:room-compiler:2.4.3"


