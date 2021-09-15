function load(){
    return {
        employees: [],
        async loadEmployees(){
            this.employees = await fetch('/empleados/listar').then(response => response.json());
            console.log(this.employees);

            const employeesList = this.employees.map(function(e) {
                return [
                    e.foto, 
                    e.nombres, 
                    e.apellidos, 
                    e.sede.nombre, 
                    e.email || 'Sin Email', 
                    e.dni
                ]
            });

            $('#employeesTable').DataTable( {
                data: employeesList,
                columns: [
                    { title: "Foto" },
                    { title: "Nombres" },
                    { title: "Apellidos" },
                    { title: "Sede" },
                    { title: "Email" },
                    { title: "DNI" },
                ],
                "columnDefs": [ {
                    "targets": 0,
                    "render": function ( data, type, row, meta ) {
                        return `<img src="/img/empleados/${data || 'default.png'}" width="50px"></img>`;
                    },
                }],
                language: {
                    url: "https://cdn.datatables.net/plug-ins/1.11.1/i18n/es_es.json"
                },
            });
        },
        openModal(){
            $('#mainModal').modal('show')
        },
        closeModal(){
            $('#mainModal').modal('hide')
        }
    }
}