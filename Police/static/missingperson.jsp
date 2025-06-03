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
            <div class="card shadow-sm border-0">
                <div class="card-header bg-warning text-dark text-center">
                    <h4>Report Missing Person</h4>
                </div>
                <div class="card-body">
                    <form action="missing" method="post">
                        <div class="mb-3">
                            <label class="form-label">Missing Person Name</label>
                            <input type="text" name="missingName" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Complaintee Mobile</label>
                            <input type="text" name="complainteeMobile" class="form-control" required>
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
                            <label class="form-label">Last Seen Location</label>
                            <input type="text" name="location" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Identifiable Marks</label>
                            <input type="text" name="marks" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Gender</label>
                            <input type="text" name="gender" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Known Languages</label>
                            <input type="text" name="lang" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-warning w-100">Submit Report</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
