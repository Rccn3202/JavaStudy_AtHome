function showStoresList(data, stores) {
    if (stores.length == 0) {
      console.log('empty stores');
      return;
    }
  
    let panel = document.createElement('div');
    // If the panel already exists, use it. Else, create it and add to the page.
    if (document.getElementById('panel')) {
      panel = document.getElementById('panel');
      // If panel is already open, close it
      if (panel.classList.contains('open')) {
        panel.classList.remove('open');
      }
    } else {
      panel.setAttribute('id', 'panel');
      const body = document.body;
      body.insertBefore(panel, body.childNodes[0]);
    }
  
    // Clear the previous details
    while (panel.lastChild) {
      panel.removeChild(panel.lastChild);
    }
  
    stores.forEach((store) => {
      // Add store details with text formatting
      const name = document.createElement('p');
      name.classList.add('place');
      const currentStore = data.getFeatureById(store.storeid);
      name.textContent = currentStore.getProperty('name');
      panel.appendChild(name);
      const distanceText = document.createElement('p');
      distanceText.classList.add('distanceText');
      distanceText.textContent = store.distanceText;
      panel.appendChild(distanceText);
    });
  
    // Open the panel
    panel.classList.add('open');
  
    return;
  }