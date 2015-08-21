# Default play-java template with Spring
## Specs
* [Play Framework 2.4.2](https://www.playframework.com/)
* [Play Java Seed 2.4.2 (activator template)](http://www.typesafe.com/activator/template/play-java)
* [Spring Framework 4.2.0.RELEASE](http://projects.spring.io/spring-framework/)
* [Spring-Guice integration 1.0.0.BUILD-SNAPSHOT](https://github.com/spring-projects/spring-guice)

## Introduction
Getting Play Framework < 2.4 to work with Spring Framework, was relative easy: [https://www.playframework.com/documentation/2.3.x/JavaInjection](https://www.playframework.com/documentation/2.3.x/JavaInjection).

In Play Framework 2.4, they added *"[dependency injection support](https://www.playframework.com/documentation/2.4.x/JavaDependencyInjection)"*:

> Out of the box, Play provides dependency injection support based on JSR 330. The default JSR 330 implementation that comes with Play is Guice, but other JSR 330 implementations can be plugged in.

But getting Play 2.4 to work with for example Spring dependency injection is hard to accomplish, especially compared to 2.3, where you could get it to work with just a few lines of code.
So instead of making it easier, they made it a lot harder, and basically forced the use Google Guice as depedency injection container, which is also used internally by Play since 2.4.

But thanks to the Spring-Guice snapshot project, we don't have to learn and write the complex Spring and Guice internals.

## Notes
* Another Play 2.4 solution can be found at [https://github.com/zarinfam/play24-guice-spring](https://github.com/zarinfam/play24-guice-spring), which has the Spring-Guice project code embedded and modified to refer to a Spring configuration class.
* [https://github.com/jroper/play-spring](https://github.com/jroper/play-spring) (for Play 2.4) doesn't seem to work.
* [https://github.com/jamesward/play-spring](https://github.com/jamesward/play-spring) (for Play 2.4) doesn't seem to work.
