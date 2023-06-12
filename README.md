# java-reactive-programming-course

This repository contains the code samples, assignments etc for my course on Udemy platform.


## publisher subscription

```

           ,-----------------------.            
           |Subscription           |            
           |-----------------------|            
           |+request(n: long): void|            
           |+cancel(): void        |            
           `-----------------------'            
                        |                       
                        |                       
,----------------------------------------------.
|Subscriber                                    |
|----------------------------------------------|
|+onSubscribe(subscription: Subscription): void|
|+onNext(data: T): void                        |
|+onError(error: Throwable): void              |
|+onComplete(): void                           |
`----------------------------------------------'
                        |                       
 ,-------------------------------------------.  
 |Publisher                                  |  
 |-------------------------------------------|  
 |+subscribe(subscriber: Subscriber<T>): void|  
 `-------------------------------------------'  

 ```