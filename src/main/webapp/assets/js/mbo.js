var currentlySelectedRow;

$(document).ready(function(){
  selectMultipleSwatches();
});

function selectMultipleSwatches() {
/*
For each row, when you click on an item,
1- add class of "selected" (if item already has class of "selected", remove that class)
2- if there is only one item on one row selected, show only ".omdweb-vehicle-config-detail-single"
3- if there is more than one item on one row selected, show only ".btn-reject-all"
4- if the user makes a selection in another row, hide everything, remove all instances of "selected" from other rows, and apply rules 2 and 3 to that row
*/

  $('ul.omdweb-vehicles-config-list > li').each(function() {
    var id ='#'+$(this).attr('id');

    $(id+' ol.omdweb-vehicle-config-swatches li').click(function (e){
      if(currentlySelectedRow == null || currentlySelectedRow == $(this).parent().parent().attr('id')) {
        e.preventDefault();
        $(this).toggleClass('selected');

        if ($(id+' .omdweb-vehicle-config-swatches li.selected').length == 1) {
          $(id+' .btn-reject-all').hide();
          $(this).parent().next().next().children(id+' .omdweb-vehicle-config-detail-single').show();
        }
        else if ($(id+' .omdweb-vehicle-config-swatches li.selected').length > 1) {
          $(id+' .omdweb-vehicle-config-detail-single').hide();
          $(this).parent().next().next().children('.btn-reject-all').show();
        }
        else {
          $(id+' .omdweb-vehicle-config-detail-single').hide();
          $(id+' .btn-reject-all').hide();
        }

        currentlySelectedRow = $(this).parent().parent().attr('id');
      } else {
        // clear all selections and remove all details/reject buttons
        $('#'+currentlySelectedRow).find('.selected').each(function() {
          $(this).removeClass('selected');
        });
        $('#'+currentlySelectedRow).find('.btn-reject-all').each(function() {
          $(this).hide();
        });
        $('#'+currentlySelectedRow).find('.omdweb-vehicle-config-detail-single').each(function() {
          $(this).hide();
        });

        // Then behave normally
        e.preventDefault();
        $(this).toggleClass('selected');

        if ($(id+' .omdweb-vehicle-config-swatches li.selected').length == 1) {
          $(id+' .btn-reject-all').hide();
          $(this).parent().next().next().children(id+' .omdweb-vehicle-config-detail-single').show();
        }
        else if ($(id+' .omdweb-vehicle-config-swatches li.selected').length > 1) {
          $(id+' .omdweb-vehicle-config-detail-single').hide();
          $(this).parent().next().next().children('.btn-reject-all').show();
        }
        else {
          $(id+' .omdweb-vehicle-config-detail-single').hide();
          $(id+' .btn-reject-all').hide();
        }
        currentlySelectedRow = $(this).parent().parent().attr('id');
      }


    });
  });

}
