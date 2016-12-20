<%@page import="java.util.*" %>
<%@page import="net.codetojoy.*" %>

<html>
<head> <title>Silly Greeting Example</title> </head>
<body>
  <%
    String lang = request.getParameter("lang");
    Greeter greeter = new Greeter();
    String greeting = greeter.greet(lang);
  %>
  <h2>Greeting:</h2><p> <%= greeting %> </p>

  <hr/>

  <%
    BuildInfo buildInfo = new BuildInfo();
    String version = buildInfo.getVersion();
    String buildNumber = buildInfo.getBuildNumber();
    String buildTimestamp = buildInfo.getBuildTimestamp();
  %>
  <h4>Version: <%= version %> </h4>
  <h4>Build Number: <%= buildNumber %> </h4>
  <h4>Build Timestamp: <%= buildTimestamp %> </h4>
</body>
</html>
