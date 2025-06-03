<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Theft Complaint Submitted</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="card shadow-sm border-success">
                <div class="card-header bg-success text-white text-center">
                    <h4>Complaint Submitted Successfully</h4>
                </div>
                <div class="card-body">
                    <p><strong>Name:</strong> ${name}</p>
                    <p><strong>Mobile Number:</strong> ${mobile}</p>
                    <p><strong>Age:</strong> ${age}</p>
                    <p><strong>Address:</strong> ${address}</p>
                    <p><strong>Location of Theft:</strong> ${location}</p>
                    <p><strong>Item Lost:</strong> ${item}</p>
                    <p><strong>Date of Theft:</strong> ${lostOn}</p>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
