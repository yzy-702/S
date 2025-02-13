
// طلب الحروف من المستخدم
const firstLetter = prompt("أدخل الحرف الأول:");
const secondLetter = prompt("أدخل الحرف الثاني:");

// تحديث التوقيع بالنص المدخل
const signatureDiv = document.querySelector('.signature');
signatureDiv.innerText = `${firstLetter} & ${secondLetter} 💞`;

// تحديث رسالة النجاح أيضًا
function sayYes() {
  alert(`Yay! ❤️ You made my day, ${firstLetter} & ${secondLetter} forever!`);
}
