mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------< cl.kibernumacademy:productmanager >------------------
[INFO] Building productmanager 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ productmanager ---
[INFO] skip non existing resourceDirectory C:\Users\mvera\OneDrive\Escritorio\eq1\modulo-3-actividad-3\productmanager\src\main\resources
[INFO]
[INFO] --- compiler:3.11.0:compile (default-compile) @ productmanager ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ productmanager ---
[INFO] skip non existing resourceDirectory C:\Users\mvera\OneDrive\Escritorio\eq1\modulo-3-actividad-3\productmanager\src\test\resources
[INFO]
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ productmanager ---
[INFO] Changes detected - recompiling the module! :input tree
[INFO] Compiling 1 source file with javac [debug target 17] to target\test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[13,11] cannot find symbol
  symbol:   class ProductManager
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[17,19] cannot find symbol
  symbol:   class ProductManager
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[27,5] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[35,5] cannot find symbol
  symbol:   class List
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[35,10] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[41,5] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[51,5] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[60,5] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[66,5] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[77,7] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[87,5] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[88,5] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[90,5] cannot find symbol
  symbol:   class List
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[90,10] cannot find symbol
  symbol:   class Product
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[93,29] cannot find symbol
  symbol:   method hasSize(int)
  location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[95,60] cannot find symbol
  symbol:   method greaterThanOrEqualTo(double)
  location: class cl.kibernumacademy.util.ProductManagerTest
[INFO] 16 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.770 s
[INFO] Finished at: 2025-07-10T21:57:58-04:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile (default-testCompile) on project productmanager: Compilation failure: Compilation failure:
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[13,11] cannot find symbol
[ERROR]   symbol:   class ProductManager
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[17,19] cannot find symbol
[ERROR]   symbol:   class ProductManager
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[27,5] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[35,5] cannot find symbol
[ERROR]   symbol:   class List
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[35,10] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[41,5] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[51,5] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[60,5] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[66,5] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[77,7] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[87,5] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[88,5] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[90,5] cannot find symbol
[ERROR]   symbol:   class List
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[90,10] cannot find symbol
[ERROR]   symbol:   class Product
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[93,29] cannot find symbol
[ERROR]   symbol:   method hasSize(int)
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] /C:/Users/mvera/OneDrive/Escritorio/eq1/modulo-3-actividad-3/productmanager/src/test/java/cl/kibernumacademy/util/ProductManagerTest.java:[95,60] cannot find symbol
[ERROR]   symbol:   method greaterThanOrEqualTo(double)
[ERROR]   location: class cl.kibernumacademy.util.ProductManagerTest
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
