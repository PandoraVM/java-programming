# Java Programming  

Vamos iniciar incluíndo as classes models e os métodos getters, setters e constructors.  
Para inserir esses métodos, vamos utilizar a biblioteca Lombok.  
Então voltamos no Spring Initialzr e vamos em "add dependencies" e selecionamos "Lombok", em seguida clicamos em "explore" e copiamos a dependêcia e a configuração que está dentro de `plugin`  que está lá.   

```xml
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>

      <plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin> 
```
