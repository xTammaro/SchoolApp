# [Dream Team] Report

## Table of Contents

1. [Team Members and Roles](#team-members-and-roles)
2. [Summary of Individual Contributions](#summary-of-individual-contributions)
3. [Conflict Resolution Protocol](#conflict-resolution-protocol)
4. [Application Description](#application-description)
5. [Application UML](#application-uml)
6. [Application Design and Decisions](#application-design-and-decisions)
7. [Summary of Known Errors and Bugs](#summary-of-known-errors-and-bugs)
8. [Testing Summary](#testing-summary)
9. [Implemented Features](#implemented-features)
10. [Team Meetings](#team-meetings)

## Team Members and Roles (alphabetical order)

| UID            |       Name        |                                                              Role |
|:---------------|:-----------------:|------------------------------------------------------------------:|
| [u7544620]     |     [Bo Dai]      |  [CoreService Interface,Entity classes,Firebase data persistence] |
| [u7484595]     |  [Toby Kitchen]   |                                            [Parser and Tokenizer] |
| [u7074622]     |  [Jake Tammaro]   |     [AVLtree, quiz and question classes, quiz android activities] |
| [u7487972]     | [Prathmesh Sinha] |          [Firebase project integration, video player integration] |
| [u6896272]     | [Nicholas Tonkin] | [Team therapist, android activities, process feature integration] |

## Summary of Individual Contributions

*[Summarise the contributions made by each member to the project, e.g. code implementation, code design, UI design, report writing, etc.]*

*[Code Implementation. Which features did you implement? Which classes or methods was each member involved in? Provide an approximate proportion in pecentage of the contribution of each member to the whole code implementation, e.g. 30%.]*


*[Code Design. What design patterns, data structures, did the involved member propose?]*

*[UI Design. Specify what design did the involved member propose? What tools were used for the design?]*

*[Report Writing. Which part of the report did the involved member write?]*

*[Slide preparation. Were you responsible for the slides?]*

*[Miscellaneous contributions. You are welcome to provide anything that you consider as a contribution to the project or team.]*

* u7074622, Jake Tammaro
* My contribution to this project includes designing the AVL tree that stores the quizzes interacted with in the app, as well as significantly contributing to the quiz UI design. 
* This contribution consists of core tree classes: 
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/Tree.java#L1-63, 
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/QuizTree.java#L1-276
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/EmptyQuizTree.java#L1-55
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/QuizTreeHolder.java#L1-28
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/QuizListHolder.java#L1-41

* Model quiz/question classes: 
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/Quiz.java#L1-124 
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/Question.java#L1-65 

* Quiz activity classes: 
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/QuizSelectorActivity.java#L1-70  
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/QuizSearchActivity.java#L1-104
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/DoQuizActivity.java#L1-384
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/QuizResultsActivity.java#L1-38

* Quiz tree test class: 
    * https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/test/java/com/example/readyforhighschool/QuizTreeTest.java#L1-132. 

* The tree implements the general feature: data deletion (hard), it also uses the template method design pattern. Classes for storing the quiz tree and current user quiz list implement the singleton design pattern.  

* I wrote in the report about the AVL tree data structure, the data deletion (hard) general feature, template method design pattern and singleton design pattern.

u7544620,Bo Dai. Here are my contributions:
* [The CoreService Interface](../readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/CoreService.java)  and its implementation, which aims to provide service for android development.
* Working on the persistence data to Firebase, as well as the [entity classes](../readyforhighschool/app/src/main/java/com/example/readyforhighschool/model) in our project.Fake data generating.
* Early versions of [class diagram1](images/ClassDiagram_v1.png).[class diagram2](images/ClassDiagram_v2.png).
  Our goal is to customize relevant course experience for Students with different executive function score
  The roles include teacher,parent,student.
  Teachers manage course materials.
  Parents choose courses for students, system generates relevant course materials.
  Students study the materials. 
* Singleton is used to get the database Instance.
* Facade is used for the CoreService interface.

u7484595, Toby Kitchen. I contributed:
* [Search](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/model/Search.java)
* Some changes to [VideoActivity](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/VideoActivity.java), specifically to implement the search functionality
* SearchTest, which was a test suite designed to fully test the Search function. The coverage report is here: [Search Test Coverage Report](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/items/images/tests/SearchTestCoverageReport.png)
* I also participated in group discussions about the design and made some relevant sketches/documentation. Some examples are the [design for the search/tokeniser/parser](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/items/images/tests/SearchDesign.png) and a [UI Design Sketch](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/items/images/tests/UIDesignSketch.png). That sketch shows a preliminary design for the video screen (left) and the quiz screen (right). While we didn't use those designs, they served as an early basis for our design structure.
* The report section on the search feature, its tests, the tokenizer/parser, and the grammar.

u7487972, Prathmesh Sinha. My contributions include the implementation and integration of Firebase in our project, whilst also creating the VideoPlayer (which fetches a video from Firebase Storage) as well VideoUpload (which uploads a video to Firebase Storage).
* [VideoPlayerActivity](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/VideoPlayerActivity.java#L29).
* [VideoUploadActivity](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/VideoUploadActivity.java#L33).
* Contributions and edits to [RegisterActivity](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/RegisterActivity.java#L137) to ensure that a verification email is sent to users.
* Add the functionality to sign out in [MainActivity](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/readyforhighschool/app/src/main/java/com/example/readyforhighschool/MainActivity.java#L196).

u6896272, Nicholas Tonkin. I contributed:

* [MainActivity] - Demonstration of data persistence for the app - integrates user's login with the rest of the app, and launches working memory assessment activity by browser on another thread, then delivers the data to the user's firebase doc.
* [RegisterActivity] - Provides capability of first-time registration for the app.
* [LoginActivity] - Allows login for persistent user instances.
* [DoQuizActivity] - Initial implementation, but extended by Jake Tammaro. Allows user to answer quiz questions & calls to DatabaseMethods class to update the quiz scores.
* [CalculateWorkingMemoryScore] - Calculates working memory score for use by researchers to compare student performance with working memory test.
* [DatabaseMethods] - Includes bespoke methods of updating specific values on firebase to reduce code duplication.
* [WorkingMemoryListener] - Singleton class listener that listens for working memory score to be delivered by intent extras from web browser. Ensures only one such score is sent to firebase at a time.
* [studentCallbackInterface] - separate callback interface that facilitates receipt of multithreaded Handler Post messages from the working memory test.
* [JSwebappintegration] - Modified testing activity that allows evidence-based data collection for students participating on the app
* Video, powerpointslides, conflict resolution protocol, use cases, team meeting arrangement (most minutes were on teams until final week that was my fault!).

## Conflict Resolution Protocol


The Dream Team's group problem-solving employed a two-tiered system throughout project development, along with an
overarching principle.

### The Overarching Principle

**Attack the problem, not the person:** The dream team chose an ambitious goal for our project. Frustration was bound to
occur at some point. Given that we knew conflict was a possibility, the Dream Team agreed to avoid speaking negatively
about other team members behind their backs. The present report considers that this respectful team attitude led to
a generally positive groupwork experience.

### Second Tier:

Group problem-solving was conducted through regular face-to-face and Microsoft Teams collaboration
throughout project development.
Regular face-to-face meetings and occasional group-coding sessions further enhanced problem-solving.
In week 9, at least one person in the team was present in the CSIT computer lab each evening in case a team member needed assistance
with their role.

**Case study for Second tier problem solving:** In week 9, three students in the group were having difficulty compiling
the project. Initially this caused minor disruption as we approached the difficulty as a project structure issue.
The two team-members with working projects met together to discuss methods to assist the three students in creating
working project environments. The meeting led to an organised & picture annotated explanation of how our group's project
is structured on the repository. This led to all team members having access to the project, and facilitated the integration
of the team's separate class and layout files.


### First Tier:

The group assigned a de facto leader to facilitate group meetings and shape the objectives of the project. The present
two-tiered system considers explicit leadership intervention to be the "First Tier" of conflict resolution. Our group did not
require the first tier for any significant problems. The group agreed with all concepts implemented in the project.

**Case study for First tier problem solving:** The Dream Team can be described as a creative powerhouse.
This creativity led to a wide range of ideas for facilitating the central idea of providing students with appropriate 
videos and quizzes for their learning style. This creativity also led to exciting suggestions that were not realistic 
given the timeline of the assignment. In the event that there were too many opinions on a course of action, the First Tier conflict
resolution method enabled the leader to decide on the course of action that he deemed appropriate. While the final
decision was not always the best or most efficient decision, consensus was achieved quickly and consistently.


## Application Description

Ready For Highschool is an educational app intended for children between year-levels 6 to 8. One team member's work as
a Provisional Psychologist led him to notice that parents seeking assessment and therapy are anxious about whether their
child is ready for highschool. Further, the team member's work involves the treatment and assessment of psychological
disorders. This experience led the team member to understand the importance of Executive Function constructs for a young person's ability to 
retain information presented in the classroom. Schools are not able to provide the required assistance for children with specific
learning disorders or executive dysfunction presentations due to restrictions associated with class-size and resources.

**Evidence-based treatment method**

Ready for Highschool may be able to gather initial information about
a child's relative cognitive strengths and difficulties, and present videos and quizzes that are appropriate to that child's
relative ability through a treatment and educational approach known as "scaffolding". 

**Application Use Cases and or Examples**

**Use case #1: A child with domain-specific difficulties**

1. Student registers an account
2. Student completes working memory test
3. Student accesses video and quiz material can be set at a lower level based on their working memory score, and ratio of quizzes passed to quizzes attempted.
4. Student may determine required difficulty of the material by decreasing or increasing their rate of quizzes passed to quizzes attempted (pass = 60% mark).
5. Student may submit video explanations of their learning process.

It may be counterproductive to challenge a child with Year 7 material if the child’s current standard in that particular domain is at Year 5 level.
Repeated failure may lead to conditioned avoidance of the learning material.

It is better to build the child's confidence and capacity through educational- and ability level appropriate material. ReadyForHighschool can identify the appropriate level of content for the child, and allow the child to work on more difficult content over time.

**Use case #2 A child with domain-specific strengths**

1. Student registers an account
2. Student completes working memory test
3. Student accesses video and quiz material that is set at a higher level based on their working memory score, and ratio of quizzes passed to quizzes attempted.
4. Student may determine required difficulty of the material by decreasing or increasing their rate of quizzes passed to quizzes attempted (pass = 60% mark).

Parents may wonder if their 6 year old precocious child is already Ready For Highschool. In such a case, the child may be presented with more advanced material for their ability.

**Use case #3 A child with no particular difficulties**

1. Student registers an account
2. Student completes working memory test
3. Student accesses video and quiz material that is set at a similar level based on their working memory score, and ratio of quizzes passed to quizzes attempted
4. Student may determine required difficulty of the material by decreasing or increasing their rate of quizzes passed to quizzes attempted (pass = 60% mark).

Children with no difficulties or particular areas of strength can still improve their familiarity with highschool material using Ready For Highschool.

**Use case #4 A psychology researcher**

1. Psychology researcher implements JS web based testing protocol similar to the one present in the app and links it to

Psychology researchers across a range of domains will be able to utilise this platform to collect data about the way children with specific learning styles interact with quiz and video content. Statistical techniques such as regression and ANOVA can be used to determine substantial predictors of performance increases. The application platform can also be used to test construct validity of cognitive and educational assessments.

## Application UML

[class diagram1](images/ClassDiagram_v1.png).<br>
[class diagram2](images/ClassDiagram_v2.png).<br>


## Application Design and Decisions

*Please give clear and concise descriptions for each subsections of this part. It would be better to list all the concrete items for each subsection and give no more than `5` concise, crucial reasons of your design. Here is an example for the subsection `Data Structures`:*

*I used the following data structures in my project:*

**ArrayList, AVLTree**

1. *LinkedList*

   * *Objective: It is used for storing xxxx for xxx feature.*

   * *Locations: line xxx in XXX.java, ..., etc.*

   * *Reasons:*

     * *It is more efficient than Arraylist for insertion with a time complexity O(1)*

     * *We don't need to access the item by index for this feature*

2. *

3. ...

**Data Structures**

*[What data structures did your team utilise? Where and why?]*
1.  [AVL Tree]. 
The application encoporates an AVL tree to store quizzes from firebase, retrieve quizzes based on average score and updates quizzes after user completion.

    * Tree.java whole class
    * QuizTree.Java whole class
    * EmptyQuizTree.java whole class
    * MainActivity.java fetchQuizzes() lines 116-132 
    * QuizSearchActivity.java OnCreate() lines 53-113
    

The quiz data is initially stored on Firebase, and upon logging into the application, these quizzes are transformed into Quiz objects and subsequently inserted into the Quiz Tree. This tree sorts its nodes based on the average score of the quizzes, enabling a unique feature that allows users to choose between easy, medium, or hard quizzes.

These difficulty levels correspond to specific average score ranges (which can be adjusted), and once a user makes their selection, the tree efficiently traverses its structure to gather all quizzes within the specified range. As the app continues to grow and more quizzes are added, the AVL tree's self-balancing property guarantees that the tree's height remains logarithmic in relation to the number of quizzes. This ensures consistently optimal search performance, providing a seamless and responsive experience for users.

**Design Patterns**

*[What design patterns did your team utilise? Where and why?]*

**MVC**, **Setters and Getters**, **Singleton**, **Observer Pattern**

1. [Template Method].
    * *Objective: This design pattern is used to implement the AVL tree.

    * *Locations: The abstract super class is located in Tree.java. The subclasses QuizTree.java and EmptyQuizTree.Java extend and implement the abstract methods.
    * *Reasons:*
       * *It provides a template or blueprint for the AVL tree operations, allowing for easy customization and extension.*

       * *It promotes code reuse by defining common methods in the abstract super class and allowing subclasses to implement specific behaviors.*

       * *Enables the tree to consist of two types, allowing for leaf nodes to have empty subtrees, in turn making insertion and deletion easier.*

2. [Singleton].
    * *Objective: To ensure one specific instance of AVL tree and Quiz list is available across the application.*

    * *Locations: QuizTreeHolder.java and QuizListHolder.java*

    * *Reasons:*
       * *To provide a centralized access point for the AVL tree and Quiz list, allowing other components and classes to easily retrieve/modify data.*
       
       * *To enable global coordination and consistency when accessing and updating the AVL tree and Quiz list.*
    


**Grammar(s)**

Production Rules:
    
    <Query> ::= <Word> | <Word>,<Query>
    <Word> ::= <Subject> | <Key>:<Value>
    <Subject> ::= String
    <Key> ::= String
    <Value> ::= String | Boolean | Integer

*[How do you design the grammar? What are the advantages of your designs?]*
The grammar was designed according to [this sketch](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/items/images/tests/SearchDesign.png). Essentially, a query consists of a comma-separated list of words. Each word is either a key:value pair (e.g. minLength:10), or just a value, in which case it is intepreted as a subject (the implementation of this being that the key "subject" is automatically added if there is no key given). 

A key is always a String, and is currently only either Subject, minLength, maxLength, or Watched, but there is scope for additional search parameters to be added in the future. 

A value is either a String (where key is Subject), a Boolean (where the key is Watched), or an Integer (when the key is min or max length). 

**Tokenizer and Parsers**

*[Where do you use tokenisers and parsers? How are they built? What are the advantages of the designs?]*


The tokeniser and parser are used together to process searches for videos. They give the search feature the ability to take multiple arguments (subject name, min/max video length, whether or not the video has been watched before). 

The tokeniser/parser implements the grammar described in the previous section, though it takes some shortcuts. For example, to separate a query into words, it doesn't use recursion. Instead it just splits the query string on commas and then iteratively parses each of those. The advantage of this is speed and simplicity of maintenance, the latter of which is especially important because this feature has the capacity to include several more search parameters. 


**Surprise Item**

*[If you implement the surprise item, explain how your solution addresses the surprise task. What decisions do your team make in addressing the problem?]*

**Other**

*[What other design decisions have you made which you feel are relevant? Feel free to separate these into their own subheadings.]*

## Summary of Known Errors and Bugs

*[Where are the known errors and bugs? What consequences might they lead to?]*

*Here is an example:*

1. *Bug 1:*

- *A space bar (' ') in the sign in email will crash the application.*
- ...

2. *Bug 2:*
- clicking the quiz link before the tree has instantiated on user profile will crash the application.

3.
- completion of working memory test following first time registration will crash the app, but will retain the logged-in user and working memory test for future login & firebase retrieval.

*List all the known errors and bugs here. If we find bugs/errors that your team does not know of, it shows that your testing is not thorough.*

## Testing Summary
**In progress - will be refactoring and testing over the next 7 days.**
*[What features have you tested? What is your testing coverage?]*

*Here is an example:*

- *Number of test cases: ...*

- *Code coverage: ...*

- *Types of tests created: ...*

*Please provide some screenshots of your testing summary, showing the achieved testing coverage. Feel free to provide further details on your tests.*

1. AVL Tree tests

- *Test cases: 12*
- *Code coverage: Branch complete 100% methods, 91% lines*
- *Unit tests:
- Insertion Tests: Tests for inserting new nodes into the tree, both with and without requiring rotations.
- Deletion Tests: Tests for deleting nodes from the tree, both with and without requiring rotations.
- Rotation Tests: Tests for the left and right rotation methods, included within the insertion and deletion tests.
- Balancing Tests: Tests to ensure the tree remains balanced after operations. 
![QuizTree Test Coverage](./images/tests/QuizTreeTestCoverageReport.png)

2. Search Tests
- Test Cases: 13
- Code coverage: Branch complete 100% methods, 96% lines. [Report](https://gitlab.cecs.anu.edu.au/u6896272/ga-23s1-comp2100-6442/-/blob/main/items/images/tests/SearchTestCoverageReport.png)
- The tests were unit tests. The test is based on 8 videos which were created at the start that all contain some combination of characteristics (i.e. length = 1 or length = 5, subject = english or maths, watched = true or false); then lists of videos are created with various combinations of these videos. Each test case provides a query and then compares the result of the search query with the desired video list. There are also a couple of extra test cases to test certain features (e.g. case-insensitivity).

## Implemented Features

*[What features have you implemented?]* **note, as of 10-5-23, some of these are in progress. > 90% of them will be realised.

**Login & rego**, **Data Visualization (user rego and video adding)**, **Data loading- quizzes,videos**, **search**
**AVLTree for quiz selection**, (end of basics)

**search-filter[easy]** **data-profile[medium]**, **data-formats]easy]**,  **interact-micro[easy]** **interact-follow[medium]**,
**Process[hard]**, **process-visualize**[medium] **FB-Auth[easy]**, **FB-persist[medium]**, **FB-Syn[hard].

### Basic App
1. [Login]. Description of the feature and your implementation (easy)
    * Class X, methods Z, Y, Lines of code: 10-100
    * Additional description: ...
      <br>
2. [Data Visualization]. Description  ... ...



<br><br>

### General Features
Feature Category: Search
1. [Search-Filter] (Easy)
Class Search, all methods. 
    - The user can search for videos in the VideoActivity. They provide zero or more parameters including the subjects of the videos, the minimum or maximum length, and whether or not they have already watched the videos. The search query is handled by the tokeniser and parser as described before and the parameters are used to filter the list of available videos.
2. [Search-Invalid] (Medium)
Class Search, only partially added as small optimisations within the other methods.
    - One example is that queries are case-insensitive, and extra whitespace is ignored (i.e. "math,maxlength:3" and "  MATH    ,   MaXLeNGTH:3  " will return the same results).
    - Another example is that a blank query is handled, and returns every video available to the student.
    - Queries are comprised as comma-separated 'words', each containing one parameter. If one word is invalid, the rest of the query will still be executed successfully.


Feature Category: Privacy <br>
1. [Privacy-Request]. Description of the feature and your implementation (easy)
   * Class X, methods Z, Y, Lines of code: 10-100
   * Class Y, methods K, L, M, Lines of code: 35-150
   * Additional description: ...
<br>
2. [Privacy-Block]. Description ... ... (medium)
    * ... ...
<br>

Feature Category: Firebase Integration <br>
*FB auth
*FB persist
*FB syn
*All classes, whole of code.


1. [Data Deletion] (hard)
The application includes deletion of data from the AVL tree in order to update the Quiz tree upon completion of a quiz
    * QuizTree.java deleteQuiz(Quiz) lines 179-222
    * DoQuizActivity.java updateQuizAndUserScore() lines 259-311

* Upon completion of a quiz, the quiz is deleted from the AVL tree and then the average score of the quiz is updated. Once updated the quiz is then reinserted into the tree ensuring that it is correctly placed in either the easy, medium or hard categories of quizzes.

*List all features you have completed in their separate categories with their difficulty classification. If they are features that are suggested and approved, please state this somewhere as well.*

## Team Meetings

*Here is an example (you could start numbering your meetings from 1):*

- *[Team Meeting 1](./meeting1.md)*

- *[Team Meeting 6](./meeting6.md)*

- *[Team Meeting 7](./meeting7.md)*

- *[Team Meeting 8](./meeting8.md)*

- *[Team Meeting 9](./meeting9.md)*
