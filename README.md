# CoffeeMaker Dagger2-Sample

## Usage

```bash
./gradlew execute
```

## Getting Start

Main: [examples/simple/src/main/java/coffee/CoffeeApp.java](examples/simple/src/main/java/coffee/CoffeeApp.java)

```java
    Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
    coffee.maker().brew();
```

```
$ ./gradlew execute
~ ~ ~ heating ~ ~ ~
=> => pumping => =>
 [_]P coffee! [_]P 
```

## See Also

* Official CoffeeMaker Documentation: http://google.github.io/dagger/
