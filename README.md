# spring_cron_expression

In this project, scheduling is done according to any time.

The cron expression is used in cases where the fixedRate and fixedDelay methods in the Spring Boot @Scheduled annotation are insufficient.

In this project, cron expression is used in @Scheduled annotation.

The Cron Expression Structure is as follows;

# *    *    *    *    *  command to execute
# ┬    ┬    ┬    ┬    ┬
# │    │    │    │    │
# │    │    │    │    │
# │    │    │    │    └───── day of week (0 - 6) (0 to 6 are Sunday to Saturday)
# │    │    │    └────────── month (1 - 12)
# │    │    └─────────────── day of month (1 - 31)
# │    └──────────────────── hour (0 - 23)
# └───────────────────────── min (0 - 59)
