<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Theft Complaint</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="card shadow-sm border-0">
                <div class="card-header bg-danger text-white text-center">
                    <h4>Theft Complaint Form</h4>
                </div>
                <div class="card-body">
                    <form action="theft" method="post">
                        <div class="mb-3">
                            <label class="form-label">Complainant Name</label>
                            <input type="text" name="name" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Mobile Number</label>
                            <input type="text" name="mobile" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Age</label>
                            <input type="number" name="age" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Address</label>
                            <input type="text" name="address" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Location of Theft</label>
                            <input type="text" name="location" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Item Lost</label>
                            <input type="text" name="item" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Date of Theft</label>
                            <input type="date" name="lostOn" class="form-control" required>
                        </div>
                        <button type="submit" class="btn btn-danger w-100">Submit Complaint</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
