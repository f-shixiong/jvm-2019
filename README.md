## jvm-2019



## plan
![image](https://github.com/f-shixiong/jvm-2019/blob/master/ico/plan.png?raw=true)

> ### 编译执行
```
但这个art已经做了，动态特性会失去
```

> ### 从zgc到分代zgc
```
java11使用了新的gc——zgc，gc时长实际在1～10ms，问题是目前还是单代gc，需要堆尽可能大
```

> ### 新的线程实现——从pthread到libaco或libco
```
ajvm的做法，给thread参数，避免线程堆栈一刀切，但开发成本也相应增大了
pthread -> libco ,收益参考golang
```

> ### http gc hook 
```
这个需求起初源自alibaba——希望每次session关闭时触发gc（我理解只gc一部分）  或许在一些场景下加一些gc的hook，收益不好评估
```

> ### 多租户vm —— 从进程级vm到os级vm
```
也是alibaba提的建议，多个jvm进程目前不能share内存／gc，在安卓上，这个很游泳
没有看到服务器的收益，资源调度可能会带来更多的问题。
```

> ### 更好的debugger —— 从jvm tools 到 pprof
```
jvm现在已经很好了，但很多都是基于os的，如果不用pthread实现，就不能使用os的api，可以参考pprof
```

> ### 反序列化优化
```
fastjson并不好用，希望序列化反序列化能像go那么简单且高性能
```

> ### 语言吸收框架 ssm并入jvm
```
吸收ioc aop ，避免生态分散，学习成本过大
```



> ### 开发计划 
```
1-201904 完成demo版+协程
2-201905 完成gc+vm多租户
```
