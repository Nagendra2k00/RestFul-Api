# RestFul-Api
RestFull Api using SpringBoot



@SpringBootApplication :-
	is a convenience annotation that combines three annotations:

@Configuration: Indicates that the class declares one or more @Bean methods, 
which are used to configure the Spring application context.

@EnableAutoConfiguration: Enables Spring Boot's auto-configuration mechanism, 
which automatically configures Spring beans based on the dependencies that are present in the classpath.

@ComponentScan: Scans the package where the annotated class is located for @Component-annotated classes, 
which are also used to configure the Spring application context.

************************************************************************************************************************************

 @Autowired:-

 @Autowired annotation is used on a field, the Spring container will inject an instance of the dependency into the field. The dependency must be of the same type as the field.

When the @Autowired annotation is used on a setter method, the Spring container will call the setter method with an instance of the dependency. The dependency must be of the same type as the parameter of the setter method.

When the @Autowired annotation is used on a constructor, the Spring container will pass an instance of the dependency to the constructor when the bean is created. The dependency must be of the same type as the constructor parameter.

************************************************************************************************************************************

@RestController:-

The @RestController annotation is a Spring annotation that is used to create RESTful controllers. RESTful controllers are classes that handle HTTP requests and responses. The @RestController annotation combines the @Controller and @ResponseBody annotations, which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.

************************************************************************************************************************************

@ApiOperation:-

The @ApiOperation annotation is a Swagger annotation that is used to describe an operation or typically a HTTP method against a specific path. It is used to provide more information about the operation, such as the operation's name, description, and parameters.

************************************************************************************************************************************


