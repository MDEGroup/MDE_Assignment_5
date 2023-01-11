# MDE_Assignment_5

This repository is created for the [Assignment A5](https://univaq-my.sharepoint.com/:b:/g/personal/korawit_rupanya_student_univaq_it/EeXlU3zp6IFFgWG8vcoNEgwBXTjcRWB3twHIa8TPpMjmXg?e=NgGT3Y) as apart of MDE(Model Driven Engineering) class 2022/2023 semester at Univaq(University of L'Aquila).

Group name: Chicken Restaurant
---
---
## Members
1. Cindy aprilia 286702
2. Mercy Bamiduro 286705
3. Korawit Rupanya 286847
---
>The assignment make use of model transformations by using the following languages/frameworks:
- Epsilon (ETL and EGL) 

## Task A5.1
>Apply different refactoring operations on the metamodel defined in A2 to create an updated version. Those refinements should include:
> - deletion and addition of concepts,
> - concept renaming,
> - structural refinements, for instance:
>   - adding/removing hierarchies,
>   - adding/removing structural features (i.e., attributesand references)
>   - change attribute

> Such refining steps are preliminary for the realization of task A3.2. At this stage, we will evaluate the complexity of the refining steps and their correct realization.

Here is the old model that we have

<img width="728" alt="Screenshot 2022-12-16 at 23 47 47" src="https://user-images.githubusercontent.com/93517988/208234029-97606eab-87f4-4d4b-8714-b25f4e3fd1db.png">

And here is the new model that we refactor, we called it a source model
- deletion and addition of concepts => Deleted Index & Individual
- concept renaming => FROM System TO WebApplication
- structural refinements, for instance:
    - adding/removing hierarchies => As we deleted Index & Individual the hierarchies had been removed.
    - adding/removing structural features (i.e., attributesand references) => We remove the Relation.
    - change attribute => 


## Task A5.2
>Define a model-to-model transformation to migrate models conforming to the initial metamodel version to the one refined in task A3.1. For this task,feel free to choose your preferred transformation language, i.e., ATL or ETL.Alternatively,the students can chooce an existing relational database metamodel from the existing model repositories (e.g., https://web.imt-atlantique.fr/x-info/atlanmod/index.php?title=Ecore)and transform a web modelto a relational DB model.

- Our metamodel was further instantiated by the first concrete instances named <b><i>“System.xmi”</i></b> with each concept represented in the above metaclasses, well instantiated in the model as seen in the image below;

<img width="728" alt="Screenshot 2022-12-16 at 23 53 41" src="https://user-images.githubusercontent.com/93517988/208234184-b89a9336-06c5-4cc9-a48d-6187091222a2.png">

- Additionally, the metamodel was further instantiated by the second concrete instances named <b><i>“System1.xmi”</i></b> with each concept also represented in the above metaclasses, well instantiated in the model too as seen in the image below;

<img width="728" alt="Screenshot 2022-12-17 at 00 06 29" src="https://user-images.githubusercontent.com/93517988/208234355-d4d98f72-ade7-4bdc-8961-b8ff45c62cb9.png">


## Task A5.3
>Define a model-to-text transformation that generates SQL statements for generating SQL tables and queries.By resembling the demo implemented during the lectures,for each entity the M2T should generate:
>    - a CREATE table statement,
>    - a SELECT(NOT *) statement,•a SELECT statement with WHERE isPK condition.

> For this task,feel free to choose your preferred model-to-text transformation (M2T) language, i.e., Acceleo or EGL

We have defined the following constraints and critique for both models as demonstrated in the image below and available in the video recording attached also.
- To check if the Entity has special characters.
- To check if the Attributes have special characters.
- To check if the Entity name has more than 5 characters.
- To check if the Attributes name has more than 5 characters.
- To check if the content cannot be more than 30 in a system.

<img width="910" alt="Screenshot 2022-12-17 at 19 48 39" src="https://user-images.githubusercontent.com/93517988/208257032-a327faea-cdbd-458d-ac67-6ce5e4ab16d6.png">


<img width="910" alt="Screenshot 2022-12-17 at 19 38 37" src="https://user-images.githubusercontent.com/93517988/208256608-fcbf8b04-3e92-42cf-80d3-6011f94dc9ea.png">


We have also defined the following operations as seen in the image below and in the video recording. 
- Printing all entities of contents that are not empty.
- Printing all attributes of contents that are not empty.

<img width="910" alt="Screenshot 2022-12-17 at 15 19 13" src="https://user-images.githubusercontent.com/93517988/208246426-cffb5ce9-92ed-4bc1-ac6e-061de6ea7ba0.png">

<i>Also find attached the videos of the outputs for our models.</i>

https://drive.google.com/drive/folders/11RxMFJ91eh-z0VEtdJonR1FB6Sx7M0Oc?usp=share_link

<i>The below link is also our project files, just incase you run into issue running the one provided here. This is a backup. Ciao</i>
https://drive.google.com/file/d/1RsYJlYXnh2xlZeN5BoQ_m9gJ-z9ALhmg/view?usp=share_link




