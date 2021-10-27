___
**Monitors**
___

Source: https://www.confluent.co.uk/blog/how-kafka-is-used-by-netflix/

Some of the key aspects we monitor are:

* Freshness SLA
* What is the time end to end from the production of an event until it reaches all sinks?
* What is the processing lag for every consumer?
* Max transfer rate
* How large of a payload are we able to send?
* Should we compress the data?
* Partitioning and parallelism
* Are we efficiently utilizing our resources?
* Can we consume faster?
* Failover and recovery
* Are we able to create a checkpoint for our state and resume in the case of failures?
Backpressure
* If we are not able to keep up with the event firehose, can we apply backpressure to the corresponding sources without crashing our application?
* Load distribution
* How do we deal with event bursts?
* Are we sufficiently provisioned to meet the SLA?

