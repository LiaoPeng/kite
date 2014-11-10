(function($) {
  $(function() {
    var jcarousel = $('.jcarousel');

    jcarousel
    .on('jcarousel:reload jcarousel:create', function () {
      var width = jcarousel.innerWidth();

      if (width >= 768) {
        width = width / 5;

        $('.jcarousel-control-prev').jcarouselControl({
          method: function() {
            $('.jcarousel').jcarousel('scroll', '-=1');

            var visibleItemScrollLeft = $('.jcarousel').jcarousel('visible');

            $(visibleItemScrollLeft[2]).addClass('active');
            $(visibleItemScrollLeft[0]).removeClass('active');
            $(visibleItemScrollLeft[1]).removeClass('active');
            $(visibleItemScrollLeft[3]).removeClass('active');
            $(visibleItemScrollLeft[4]).removeClass('active');
          }
        });

        $('.jcarousel-control-next')
        .jcarouselControl({
          method: function() {
            $('.jcarousel').jcarousel('scroll', '+=1');

            var visibleItemScrollRight = $('.jcarousel').jcarousel('visible');

            $(visibleItemScrollRight[2]).addClass('active');
            $(visibleItemScrollRight[0]).removeClass('active');
            $(visibleItemScrollRight[1]).removeClass('active');
            $(visibleItemScrollRight[3]).removeClass('active');
            $(visibleItemScrollRight[4]).removeClass('active');
          }
        });

      } else if (width >= 300) {
        width = width / 3;

        $('.jcarousel-control-prev')
        .jcarouselControl({
          method: function() {
            $('.jcarousel').jcarousel('scroll', '-=1');

            var visibleItemScrollLeft = $('.jcarousel').jcarousel('visible');

            $(visibleItemScrollLeft[1]).addClass('active');
            $(visibleItemScrollLeft[0]).removeClass('active');
            $(visibleItemScrollLeft[2]).removeClass('active');
          }
        });

        $('.jcarousel-control-next')
        .jcarouselControl({
          method: function() {
            $('.jcarousel').jcarousel('scroll', '+=1');

            var visibleItemScrollRight = $('.jcarousel').jcarousel('visible');

            $(visibleItemScrollRight[1]).addClass('active');
            $(visibleItemScrollRight[0]).removeClass('active');
            $(visibleItemScrollRight[2]).removeClass('active');
          }
        });
      }

      jcarousel.jcarousel('items').css('width', width + 'px');
    })

    .jcarousel({
      wrap: 'circular'
    });

    var size  = jcarousel.innerWidth();
    if (size >= 768) {
      var visibleActive = $('.jcarousel').jcarousel('visible');
      $(visibleActive[2]).addClass('active');
      $(visibleActive[1]).removeClass('active');
    }

    else if (size >= 300) {
      var visibleActive = $('.jcarousel').jcarousel('visible');
      $(visibleActive[1]).addClass('active');
      $(visibleActive[2]).removeClass('active');
    }
  });
})(jQuery);
