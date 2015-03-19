# CoffeeMaker Dagger2-Sample

## Usage

```bash
./gradlew execute
```

## Getting Start

Main: ./src/main/java/coffee/CoffeeApp.java

```java
Coffee coffee = Dagger_CoffeeApp_Coffee.create();
coffee.maker().brew();
```
