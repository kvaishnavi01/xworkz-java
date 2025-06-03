<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Missing Person Report</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="card shadow-sm border-warning">
                <div class="card-header bg-warning text-dark text-center">
                    <h4>Report Received</h4>
                </div>
                <div class="card-body">
                    <p><strong>Name:</strong> ${missingName}</p>
                    <p><strong>Complaint Mobile:</strong> ${complainteeMobile}</p>
                    <p><strong>Age:</strong> ${age}</p>
                    <p><strong>Address:</strong> ${address}</p>
                    <p><strong>Last Seen Location:</strong> ${location}</p>
                    <p><strong>Identifiable Marks:</strong> ${marks}</p>
                    <p><strong>Gender:</strong> ${gender}</p>
                    <p><strong>Known Languages:</strong> ${lang}</p>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
