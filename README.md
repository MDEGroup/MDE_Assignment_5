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
    
<img width="366" alt="Screenshot 2566-01-11 at 04 47 33" src="https://user-images.githubusercontent.com/32285708/211706362-563e35b8-cf3d-4614-9c2c-f485d7818885.png">
<img width="367" alt="Screenshot 2566-01-11 at 04 47 57" src="https://user-images.githubusercontent.com/32285708/211706400-584c3c0f-6acc-463a-95da-d1d5c98c0c02.png">

## Task A5.2
>Define a model-to-model transformation to migrate models conforming to the initial metamodel version to the one refined in task A3.1. For this task,feel free to choose your preferred transformation language, i.e., ATL or ETL.Alternatively,the students can chooce an existing relational database metamodel from the existing model repositories (e.g., https://web.imt-atlantique.fr/x-info/atlanmod/index.php?title=Ecore)and transform a web model to a relational DB model.





## Task A5.3
>Define a model-to-text transformation that generates SQL statements for generating SQL tables and queries.By resembling the demo implemented during the lectures,for each entity the M2T should generate:
>    - a CREATE table statement,
>    - a SELECT(NOT *) statement,•a SELECT statement with WHERE isPK condition.

> For this task,feel free to choose your preferred model-to-text transformation (M2T) language, i.e., Acceleo or EGL
