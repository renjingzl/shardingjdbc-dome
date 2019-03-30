# shardingjdbc-dome
只支持分表，分库需要再加配置
注：
1、config2目录中是2.X版本的配置（已弃用，保留只为了看文件中的注释说明）
2、config目录中是3.0版本的配置，需要自己写数据源和分表规则配置文件，即：DataSourceConfig.java
3、新添加整合spring boot命名空间配置方法。需打开xml中依赖配置，打开yml中数据源和分表规则配置。因为配置都写到了yml中，所以config目录中我们自己写的DataSourceConfig配置可以全部去掉

