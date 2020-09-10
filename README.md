# Dubbo Zookeeper Example

This example shows how to use [zookeeper](https://zookeeper.apache.org/) as Dubbo's registry center.

## How To Run

#### Step 1. Start All Zookeeper as Registry Center

```bash
sh /apps/zookeeper-3.6.1/bin/zkServer.sh start
```

#### Step 2. Build Examples

Simply import the whole sample project into IDE and import dependencies. 

```bash
mvn clean install
```

#### Step 3. Run Examples

0. Run `cn.idwarf.dubbo.provider.ProviderApplication` to start service provider
0. Run `cn.idwarf.dubbo.consumer.ConsumerApplicationTests` method `contextLoads()` to test, you should see the following result in the console:
```bash
Hello Dubbo
```
