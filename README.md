Succeeds:

```
$ ./gradlew clean build
```

but when you open the project in VSCode (or Eclipse) the `file.txt` resource shows up twice in the classpath so the test fails.