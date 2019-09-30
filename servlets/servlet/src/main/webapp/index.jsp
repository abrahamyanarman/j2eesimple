
    <%@include file="WEB-INF/view/ustils/header.jsp" %>
    <h2>Hello World!</h2>


    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading -->
        <h1 class="my-4">Home Page
            <small>Hi Everybody!</small>
        </h1>

        <div class="row">
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary" id="addUser" onclick="location.href='/servlet-1.0/addUser';">AddUser</button>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary" id="chkConnection">Check Connection</button>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary">Secondary</button>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary">Secondary</button>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary">Secondary</button>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary">Secondary</button>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary">Secondary</button>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <button type="button" class="btn btn-secondary">Secondary</button>
            </div>
        </div>
        <!-- /.row -->

        <script>
            $("#chkConnection").click(function(){




                    var xhttp = new XMLHttpRequest();
                    xhttp.onreadystatechange = function() {
                        if (this.readyState == 4 && this.status == 200) {
                            var resp = this.getResponseHeader("message").toString();

                            if (resp=="Success!"){
                                alert("Success!")
                            }else {
                               alert("Failure!")
                            }

                        }
                    };
                    xhttp.open("GET", "http://localhost:8080/servlet-1.0/test", true);
                    xhttp.send();


            });
        </script>

        <!-- Pagination -->
        <ul class="pagination justify-content-center">
            <li class="page-item">
                <a class="page-link" href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                    <span class="sr-only">Previous</span>
                </a>
            </li>
            <li class="page-item">
                <a class="page-link" href="#">1</a>
            </li>
            <li class="page-item">
                <a class="page-link" href="#">2</a>
            </li>
            <li class="page-item">
                <a class="page-link" href="#">3</a>
            </li>
            <li class="page-item">
                <a class="page-link" href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                    <span class="sr-only">Next</span>
                </a>
            </li>
        </ul>

    </div>
    <!-- /.container -->




</body>
</html>
