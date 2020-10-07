# catalind-path
Java Learning Path --> Cosmin Bucur 👨🏻‍💻

Write in front of the TODO to mark it as complete! 

# Technical TODO

- install

        intellij latest version
        sonarlint plugin
        .ignore plugin
    
    https://www.jetbrains.com/help/idea/managing-plugins.html
- create oracle account
    create oracle account
    
    https://www.oracle.com/ro/index.html
- create github repository (without README.md)

    https://docs.github.com/en/enterprise/2.15/user/articles/create-a-repo
- invite collaborators to repository

   https://docs.github.com/en/github/setting-up-and-managing-your-github-user-account/inviting-collaborators-to-a-personal-repository
- install mysql + mysql workbench

    https://dev.mysql.com/downloads/installer/
- install java 11

    https://medium.com/w-logs/installing-java-11-on-macos-with-homebrew-7f73c1e9fadf
- create folder 
        
        /home/dev
- create intellij project with maven
 
        catalind-path
- set java version 11 in maven

    https://www.baeldung.com/maven-java-version
    
    https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

- add .gitignore
- create packages using maven convention
    
        ex: com.company.project
- add maven dependencies

          jdbc
          mysql
          hibernate
          junit 5
          assertj
          mockito  
           
- load jdbc properties from yml files
    
        jdbc:
            url: ...
            username: ...
            password: ...
        
- load users from file
- setup log4j2 for logging (log in console and in a file)
- add hibernate support
- add spring boot support

# Features TODO

- create user crud using jdbc prepared statements

        UserDao -> UserJdbcDao
            create
            findById
            findAll
            update
            delete
            
- test UserJdbcDao
- create user crud using hibernate

        UserDao -> UserHibernateDao
    
- test UserHibernateDao
- create the service layer

        UserService
- create a user dto for request / response

        UserDto
        
- create a mapper to convert from dto (request) -> entity and entity -> dto (response)

        UserMapper
        
- validate user input manually in service
- validate user input using spring annotations

# Read / Write

- git
    - clone project
    - create remote repository in github
    - push to remote repository
    - update (fetch & pull)
    
- maven
    - maven dependency convention
    - maven folder structure
    
- java core
    - constructors https://beginnersbook.com/2013/03/constructors-in-java/

- utils
    - read from text file
    - read from yml file
    - log using log4j2
 
- jdbc
    - prepared statements
    
- test
    - junit 5
    - assertj
    - mockito
             
- hibernate
- spring
