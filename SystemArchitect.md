Scenario 1:

problems : two hours 100% drop off from both mobile and pc,
no idea what is happening behind the scene, dont know which endpoint, which order
They cannot trace any back end services
its resolved but they feel vulnerable

suggesting monolithic architecture -> tightly coupled 

Solutions:

To develop microservices architecture , loosely coupled system. So they can separate functions and test them in isolation. Can help with traceability of each microservices/ end points.

Increased traffic - > increased latency so applications possibly is crashing at the payment page. To fix this, increased internet bandwidth and integrate load balancer (traffic police), vertically and horizontally increase the server efficiency.

They have no feedback on exceptions, so they could write efficient codes to manage exception and add logger to view history of information to find out root cause. Automatic notifications for alerts such as power outage, natural disasters and so on.


Grafana: They can use grafana dashboard to monitor performances in real time.


Implementing this will help them prepare for next time.

Scenario 2:

Daily traffic anticipated to be triple during sales
Current tech includes:
group load balance to share
These are containerised and deployed manually to single remote instance

I would recommend:
To increase bandwidth to reduce latency

Kubernetes to monitor the dockerisation

Add more webservers to serve the simple front end this will also reduce latency further

Add more database server copies, in case of natural disaster / power outage so client can be served from second or third DB if the first one is out of use.

Scenario 3:


