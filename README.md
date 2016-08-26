## jira-clone-task

### This jira plugin project can selectively copy tasks from one project to another.Jira admin can also filter the tasks via issue level

Prerequisite: Maven

Build your project, 

```
mvn clean package
```
then run the following command:

```
mvn spring-boot:run
```
Your application should start up locally on port 8080

```
If you visit http://localhost:8080/atlassian-connect.json in your browser, you should see your add-on descriptor.
```
```
for installing plugin from your local server use ngrok for tunnelling your private ip to public ip. Jira only supports https so take the url provided by ngrok and put it in atlassian-connect.json . 
```