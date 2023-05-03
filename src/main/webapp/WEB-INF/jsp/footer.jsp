        </div>
    </div>
    
	<script type="text/javascript" src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/assets/datatables/datatables.js""></script>
    <script>
        $('#konsumenTable').DataTable({
        });

        $(function() {
             $.datepicker.setDefaults({
                 onClose:function(date, inst){
                     $("#selectedDtaeVal").html(date);
                 }
             });
             $( "#datepicker" ).datepicker();
         });
    </script>
</body>

</html>
