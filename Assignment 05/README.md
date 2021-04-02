# README
*Assignment 5*:
    -use assignment 2's JSON API to create a Single Page Application
    -display everything your app did via HTML in your display
    -make sure to make all requests via Ajax so that the URL does not change even though the information displayed does
    -you are not required to upload information, only display it; C/U/D operations via Ajax are extra credit

    -recommended to put .html file in public directory of your application so you don't run into any CORS issues
    -remember to bring up your browser's web console to help you debug your SPA. you can also use the console.log method to print values to the web console

*IMPORTANT*:
In order to get the assignment working, I used a firefox extension to bypass the "Cross-Origin Request Blocked: The Same Origin Policy disallows reading the remote resource at ... (Reason: CORS header 'Access-Control-Allow-Origin' missing)."

Firefox extension found here: https://addons.mozilla.org/en-US/firefox/addon/access-control-allow-origin/

Viewed the spa html file through localhost. In command line, navigate to public directory and run the command $php -S localhost:8080, and then in the browser go to http://localhost:8080/jspa.html 

*Structure*:
Make -> Cars -> Factory -> Parts
(one)     (many)    (model)     (many)
