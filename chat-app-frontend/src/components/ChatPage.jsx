import React, { useState, useRef } from 'react'
import { MdAttachFile, MdSend } from "react-icons/md";

const ChatPage = () => {

    const [messages, setMessages] = useState([
        {
            content: "Hello ",
            sender: "Durgesh",
        },
        {
            content: "Hi ",
            sender: "ankit",
        },
        {
            content: "Hello how r u ?",
            sender: "ankit",
        },
        {
            content: "I am fine..wbu?",
            sender: "Durgesh",
        }
    ]);
    const [input, setInput] = useState("");
    const inputRef = useRef(null);
    const chatBoxRef = useRef(null)
    const [stompClient, setStompClient] = useState(null);
    const [roomId, setRoomId] = useState("");
    const [currentUser] = useState("Durgesh")
    return (
        <div className=''>
            {/* this is a header */}
            <header className="dark:border-gray-700 fixed w-full dark:bg-gray-900 py-5 shadow flex justify-around items-center">
                {/* room name container */}
                <div>
                    <h1 className="text-xl font-semibold">
                        Room : <span> Family Room</span>
                    </h1>
                </div>
                {/* username container */}
                <div>
                    <h1>
                        User : <span>Madhu Kushwaha</span>
                    </h1>
                </div>
                {/* button leave room */}
                <div>
                    <button className='dark:bg-red-500  dark:hover:bg-red-700 px-3 py-2 rounded-full'>
                        Leave Room
                    </button>
                </div>
            </header>

            <main className='py-20 px-10 w-2/3 dark:bg-slate-600 mx-auto h-screen overflow-auto'>
                <div className='message_container'></div>
                {
                    messages.map((message, index) => (
                        <div key={index} className={`flex
                         ${message.sender == currentUser ? "justify-end" : "justify-start"}`}>
                            <div className={`my-2 
                            ${message.sender === currentUser ? "bg-purple-600" : "bg-gray-800"
                             } p-2 max-w-xs rounded`}
                            >
                                <div className='flex flex-row gap-2'>
                                    <img
                                        className="h-10 w-10"
                                        src={"https://avatar.iran.liara.run/public/boy"}
                                        alt=""
                                    />
                                    <div className=' flex flex-col gap-1'>
                                        <p className='text-sm font-bold'>{message.sender}</p>
                                        <p>{message.content}</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    ))
                }
            </main>

            {/* input message container */}
            <div className="fixed bottom-4 w-full h-16">
                <div className="h-full flex items-center justify-between rounded-full w-1/2 mx-auto px-4 dark:bg-gray-900">
                    {/* Input box */}
                    <input
                        type="text"
                        placeholder="Type your message here..."
                        className="flex-1 dark:bg-gray-800 text-gray-200 placeholder-gray-400 px-5 py-2 rounded-full focus:outline-none"
                    />

                    {/* Icons container */}
                    <div className="flex items-center gap-2 ml-3">
                        {/* Attach icon */}
                        <button className="dark:bg-purple-600 h-10 w-10 flex justify-center items-center rounded-full hover:bg-purple-700 transition">
                            <MdAttachFile size={20} />
                        </button>

                        {/* Send icon */}
                        <button className="dark:bg-green-600 h-10 w-10 flex justify-center items-center rounded-full hover:bg-green-700 transition">
                            <MdSend size={20} />
                        </button>
                    </div>
                </div>
            </div>

        </div>
    )
}

export default ChatPage