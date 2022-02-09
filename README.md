## community(仿牛客网项目)

1.核心功能：
- 发帖、评论、私信、转发；
- 点赞、关注、通知、搜索；
- 权限、统计、调度、监控；

2.核心技术：
- Spring Boot、SSM
- Redis、Kafka、ElasticSearch
- Spring Security、Quatz、Caffeine

3.项目亮点：

- 项目构建在Spring Boot+SSM框架之上，并统一的进行了状态管理、事务管理、异常处理；
- 利用Redis实现了点赞和关注功能，单机可达5000TPS；
- 利用Kafka实现了异步的站内通知，单机可达7000TPS；
- 利用ElasticSearch实现了全文搜索功能，可准确匹配搜索结果，并高亮显示关键词；
- 利用Caffeine+Redis实现了两级缓存，并优化了热门帖子的访问，单机可达8000QPS；
- 利用Spring Security实现了权限控制，实现了多重角色、URL级别的权限管理；
- 利用HyperLogLog、Bitmap分别实现了UV、DAU的统计功能，100万用户数据只需43.5M内存空间；
- 利用Quartz实现了任务调度功能，并实现了定时计算帖子分。