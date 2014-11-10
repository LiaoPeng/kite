$(document).ready(function(){
  toggleLists();
  dropdownMenus();
  mainNavMenu();
  qTipTooltip();
  optionsToggle();
  colorsToggle();
});

function toggleLists() {
  $('.omdweb-container:not("#omdweb-home") .view-list-trigger').click(function() {
    $(this).next().toggleClass('omdweb-open-list');
    $(this).toggleClass('omdweb-down-trigger');
  });
}

function dropdownMenus() {
  $('#interior-nav .nav-item').click(function (e) {
    e.preventDefault();
    collapsible = $(this).next();

    if (collapsible.hasClass('omdweb-collapsed')) {
      $('.nav-item').parent().removeClass("omdweb-nav-open");
      $(this).parent().addClass("omdweb-nav-open");

      $('.sub-menu-container').addClass('omdweb-collapsed');
      collapsible.removeClass('omdweb-collapsed');

      $('.nav-item').removeClass('omdweb-down');
      return $(this).addClass('omdweb-down');
    }
    else {
      $(this).parent().removeClass("omdweb-nav-open");
      collapsible.addClass('omdweb-collapsed');
      return $(this).removeClass('omdweb-down');
    }
  });
}

function mainNavMenu() {
  $('#nav-menu-trigger').click(function(event) {
    event.preventDefault();
    $(this).toggleClass("open");
    $('nav').toggleClass("open");
  })
}

function qTipTooltip() {
  $('.omdweb-poptip').each(function() {
    $(this).qtip({
      content: {
          text: $(this).next('.omdweb-poptip-content')
      },
      style: {
        classes: 'omdweb-qtip',
        def: false
      },
      position: {
          my: 'bottom center',
          at: 'top center',
          target: $(this)
      },
      show: {
          solo: true,
          event: 'click'
      },
      hide: {
          event: 'click'
      }
    });

    $('div.popover:visible').parent().removeClass('.editable-open');
  });
}

function optionsToggle() {
  $(".omdweb-options").addClass('hidden');

  $('#omdweb-show-options').click(function(event) {
    $(".omdweb-options").removeClass('hidden');
  });

  $('#omdweb-hide-options').click(function(event) {
    $(".omdweb-options").addClass('hidden');
  })
}

function colorsToggle() {
  $(".omdweb-colors").addClass('hidden');

  $('#omdweb-show-colors').click(function(event) {
    $(".omdweb-colors").removeClass('hidden');
  });

  $('#omdweb-hide-colors').click(function(event) {
    $(".omdweb-colors").addClass('hidden');
  })
}

function expandHomeBoxes() {
  $('.home-expander').click(function(event) {
    event.preventDefault();
    $('.info-box').removeClass('omdweb-info-box-expanded');
    $('.view-list').removeClass('omdweb-open-list');
    $('.view-list-trigger').removeClass('omdweb-down-trigger');
    $(this).closest('.info-box').addClass('omdweb-info-box-expanded');
    $(this).hide();
    $('.home-expander-more').show();
  });
}

function toggleHomeLists() {
  $("#omdweb-home .info-box").delegate("h2", "click", function() {
    $el = $(this);

    $('.info-box').removeClass('omdweb-info-box-expanded');
    $('.view-list-trigger').not($el).removeClass('omdweb-down-trigger');
    $('.view-list').not($el.next()).removeClass('omdweb-open-list');

    $el.closest('.info-box').addClass('omdweb-info-box-expanded');
    $el.toggleClass('omdweb-down-trigger');
    $el.next().toggleClass('omdweb-open-list');

    $('.home-expander').show();
    $('.home-expander-more').hide();

    var id = $('.omdweb-info-box-expanded').attr('id');
    if (!$('.omdweb-info-box-expanded .omdweb-open-list').length > 0) {
      $('#'+id).removeClass('omdweb-info-box-expanded');
    }
  });
}
