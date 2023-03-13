//구글 지도 보여주기
window.initMap = function () {
    const map = new google.maps.Map(document.getElementById("map"), {
      center: { lat: 37.5400456, lng: 126.9921017 },
      zoom: 10,
    });

//마커로 위치 표시하기
const malls = [
    { label: "C", name: "코엑스몰", lat: 37.5115557, lng: 127.0595261 },
    { label: "G", name: "고투몰", lat: 37.5062379, lng: 127.0050378 },
    { label: "D", name: "동대문시장", lat: 37.566596, lng: 127.007702 },
    { label: "I", name: "IFC몰", lat: 37.5251644, lng: 126.9255491 },
    { label: "L", name: "롯데월드타워몰", lat: 37.5125585, lng: 127.1025353 },
    { label: "M", name: "명동지하상가", lat: 37.563692, lng: 126.9822107 },
    { label: "T", name: "타임스퀘어", lat: 37.5173108, lng: 126.9033793 },
  ];

  //누르면 팝업뜨게 해보기~~~~
  

  
  //마커들이 지도의 가장자리에 딱 맞도록 좀 더 타이트하게 배치(A)
  //(A)google.maps.LatLngBounds() 생성자로 경계 객체를 생성한 후 
  const bounds = new google.maps.LatLngBounds();

  //클릭 시 정보 보여주기(B)
  //(B)google.maps.InfoWindow() 생성자로 정보창을 하나 생성합니다.
  const infowindow = new google.maps.InfoWindow();

  malls.forEach(({ label, name, lat, lng }) => {
    const marker = new google.maps.Marker({
      position: { lat, lng },
      label,
      map,
    });
    //(A)extend() 메서드를 호출하여 각 마커의 위치 정보를 넘겨줍니다. 
    bounds.extend(marker.position);

    //(B)마커의 클릭(click) 이벤트가 발생하면 정보창이 뜨도록 설정(되게 조그맣게 나오네)
    marker.addListener("click", () => {
        //지도 중심 이동하기
        map.panTo(marker.position);
        infowindow.setContent(name);
        infowindow.open({
          anchor: marker,
          map,
        });
      });

  });

  //(A)그 다음에 지도 객체의 fitBounds() 메서드에 지도 경계 객체를 넘겨주세요.
  map.fitBounds(bounds);


  
  
  
  




  };
