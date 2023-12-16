const $d = document;

$($d).ready(function () {
  initializeTable();
});

const initializeTable = () => {
  const table = $("#tableMesas").DataTable({
    language: {
      url: "/language/datatables-es-mx.json",
    },
    responsive: true,
    fixedHeader: true,
    rowId: "0",
    columns: [null, null, null],
    initComplete: function () {
      $("#tableMesas thead tr th").each(function (i) {
        const title = $(this).text();

        $(this).html(
          `
            <div class="d-flex gap-3 flex-column align-items-start">
              <label>${title}</label>
              <input type="seacrh" placeholder="Buscar..." class="form-control form-control-sm w-auto"/>
            </div>
           `
        );

        $("input", this)
          .on("click", function (e) {
            e.stopPropagation();
          })
          .on("keyup change", function (e) {
            if (table.column(i).search() !== this.value) {
              table.column(i).search(this.value).draw();
            }
          });
      });
    },
  });
};
