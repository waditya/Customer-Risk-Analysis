# Customer-Risk-Analysis

Insurance Risk Analytics System (IRAS) v2.0

**************************************************************************
SUMMARY
**************************************************************************
Currently, Insurance industry is losing significant time in customer acquisition.The primary reason for this is the cumulative time required to get the customer lead, customer data, analyze the customer profile and sell appropriate insurance product.This lengthy process of validating customer profile by calculating customer credit score has resulted in companies losing their customers and people in general not subscribing to personal insurance products. The project aims at predicting the risk associated with insuring a customer. The application will consider number of factors -like age, height, BMI, employment information, Insurance history, and Medical history - and compute a numerical score to indicate the risk associated with selling an insurance product to the customer. The risk score will enable an employee to tailor suitable product wherever applicable. The score will also be useful in flagging certain customers as highrisk. Suitable databases may include SQL and/or No SQL solutions. UI layer to facilitate interactionin form of programming in Web or certain of the shelf reporting tools might be added as per the scope and time lines.

**************************************************************************
CHANGES
**************************************************************************

version 0.1
- proof of architecture

version 0.2
The alpha release contains the implementation of the main system use case of displaying the Insurance risk score and grade for a customer.
It then displays product recommendation for the customer based on the risk grade.

version 1.0
-release candidate 1

-refined the recommendation algorithm (using weighted score) for primary use case to get more 
accurate results

-created separate modules to switch between different recommendation methods

-Code re-factored to make it more readable

-Automatic deletion of collection at the end of the program. The Bug is Fixed

version 2.0 

-Insurance Domain Terminologies are used instead of generic ones

- Code is optimized for performance and efficiency



**************************************************************************
SETUP
**************************************************************************
version 0.1 (For Legacy Build)
Steps to execute the project :-

1. MongoDB and java should be installed.
2. Once installed, set the environment variable for mongoDB and JAVA. Path should be selected upto bin folder.
3. Unzip the file "Team 7 - Project"
4. Open Eclipse and import from Eclipse File -> Import -> Existing Gradle Project 
5. Browse to unzipped folder location till "Team 7 - Project/Team 7 - Project"(from step 2) such that you are able to see .gradle, .settings Folders and .project file and click on Finish.
6. Go to gradle tasks under project folder in Eclipse. Alternate path is Window --> Show View --> Open Perspective -->Other.. --> Gradle (folder) --> Gradle Tasks. Under Gradle Tasks Tab, build the application (build --> build).After successful build which you will see at console ,  Go to application and click on run.

version 0.2 (For Legacy Build)
Steps to execute the project :-

1. MongoDB and java should be installed.
2. Once installed, set the environment variable for mongoDB and JAVA. Path should be selected upto bin folder.
3. Unzip the file "Team 7 - Project"
4. Open Eclipse and import from Eclipse File -> Import -> Existing Gradle Project 
5. Browse to upzipped folder location till "Team 7 - Project/Team 7 - Project"(from step 2) such that you are able to see .gradle, .settings Folders and .project file and click on Finish.
6. Go to gradle tasks under project folder in Eclipse. Alternate path is Window --> Show View --> Open Perspective -->Other.. --> Gradle (folder) --> Gradle Tasks. Under Gradle Tasks Tab, build the application (build --> build).After successful build which you will see at console ,  Go to application and click on run.
7. The Employee enters a Customer ID on the console to generate the risk score and grade.
8. The system checks for the existence of th entered ID and if the ID is not found, it displays appropriate message and asks the user to input a valid ID.
9. The system generates and displays a risk score,grade and product recommendation.
10. The system asks the employee if he wants to continue generating the score for other users or exit the system.
11. The users enters either "y" to continue or "n" to exit.
12. The system checks for the validity of the choice and asks for the correct input till it gets either "y" or "n".

version 0.3 (For Legacy Build)
Steps to execute the project :-

1. MongoDB and java should be installed.
2. Once installed, set the environment variable for mongoDB and JAVA. Path should be selected upto bin folder.
3. Unzip the file "Team 7 - Project"
4. Open Eclipse and import from Eclipse File -> Import -> Existing Gradle Project 
5. Browse to upzipped folder location till "Team 7 - Project/Team 7 - Project"(from step 2) such that you are able to see .gradle, .settings Folders and .project file and click on Finish.
6. Go to gradle tasks under project folder in Eclipse. Alternate path is Window --> Show View --> Open Perspective -->Other.. --> Gradle (folder) --> Gradle Tasks. Under Gradle Tasks Tab, build the application (build --> build).After successful build which you will see at console ,  Go to application and click on run.
7. The Employee enters a Customer ID on the console to generate the risk score and grade.
8. The system checks for the existence of th entered ID and if the ID is not found, it displays appropriate message and asks the user to input a valid ID.
9. The system generates and displays a risk score,grade and product recommendation.
10. The system asks the employee if he wants to continue generating the score for other users or exit the system.
11. The users enters either "y" to continue or "n" to exit.
12. The system checks for the validity of the choice and asks for the correct input till it gets either "y" or "n".

version 1.0

Steps to execute the project :-

1. MongoDB and java should be installed.
2. Once installed, set the environment variable for mongoDB and JAVA. Path should be selected upto bin folder.
3. Unzip the file "Team 7 - Project"
4. Open Eclipse and import from Eclipse File -> Import -> Existing Gradle Project 
5. Browse to upzipped folder location till "Team7-rc1.zip"(from step 2) such that you are able to see .gradle, .settings Folders and .project file and click on Finish.
6. Go to gradle tasks under project folder in Eclipse. Alternate path is Window --> Show View --> Open Perspective -->Other.. --> Gradle (folder) --> Gradle Tasks. Under Gradle Tasks Tab, build the application (build --> build).After successful build which you will see at console ,  Go to application and click on run.
7. The Employee enters a Customer ID on the console to generate the risk score and grade.
8. The system checks for the existence of the entered ID and if the ID is not found, it displays appropriate message and asks the user to input a valid ID.
9. The system generates and displays a risk score,grade and product recommendation.
10. The system asks the employee if he wants to continue generating the score for other users or exit the system.
11. The users enters either "y" to continue or "n" to exit.
12. The system checks for the validity of the choice and asks for the correct input till it gets either "y" or "n".

version 1.0

Steps to execute the project :-

1. MongoDB and java should be installed.
2. Once installed, set the environment variable for mongoDB and JAVA. Path should be selected upto bin folder.
3. Unzip the file "Team 7 - Project"
4. Open Eclipse and import from Eclipse File -> Import -> Existing Gradle Project 
5. Browse to upzipped folder location till "Team7-final.zip"(from step 2) such that you are able to see .gradle, .settings Folders and .project file and click on Finish.
6. Go to gradle tasks under project folder in Eclipse. Alternate path is Window --> Show View --> Open Perspective -->Other.. --> Gradle (folder) --> Gradle Tasks. Under Gradle Tasks Tab, build the application (build --> build).After successful build which you will see at console ,  Go to application and click on run.
7. The Employee enters a Customer ID on the console to generate the risk score and grade.
8. The system checks for the existence of the entered ID and if the ID is not found, it displays appropriate message and asks the user to input a valid ID.
9. The system generates and displays a risk score,grade and product recommendation.
10. The system asks the employee if he wants to continue generating the score for other users or exit the system.
11. The users enters either "y" to continue or "n" to exit.
12. The system checks for the validity of the choice and asks for the correct input till it gets either "y" or "n".



