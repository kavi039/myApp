<html>
    <head>
        <title>Show contact</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <h1>Show contact</h1>
        Name: ${contact?.name}<br />
        Phone Number: ${contact?.phoneNumber}<br />
        <g:link action="edit" id="${contact?.id}">Edit</g:link><br />
        <g:link action="delete" id="${contact?.id}">Delete</g:link><br />
        <g:link action="index">List</g:link>
    </body>
</html>
